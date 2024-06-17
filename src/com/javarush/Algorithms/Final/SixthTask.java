package com.javarush.Algorithms.Final;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class SixthTask {

    HashMap<String, String[]> map = new HashMap<>();

    HashMap <String, Integer[]> costMap = new HashMap<>();

    HashMap<String, Integer> bestCost = new HashMap<>();

    HashMap<String, Integer> resultMap = new HashMap<>();
    Queue<String> queue = new LinkedList<>();
    int countEdge = 0;

    int[][] matix = {
            {
                0, 1, 1, 0, 0 ,0 ,0
            },
            {
                1, 0, 0, 1, 1 ,0 ,0
            },
            {
                1, 0, 0, 0, 0 ,1 ,1
            },
            {
                0, 1, 0, 0, 0 ,0 ,0
            },
            {
                0, 1, 0, 0, 0 ,0 ,0
            },
            {
                0, 0, 1, 0, 0 ,0 ,0
            },
            {
                0, 0, 1, 0, 0 ,0 ,0
            }
    };



    public void addGraph() {
        /*
              A
            /   \
           C      B
          / \    / \
         G    F E   D


         */

        map.put("A", new String[]{"C", "B"});
        map.put("B", new String[]{"E", "D"});
        map.put("C", new String[]{"G", "F"});
        map.put("D", new String[]{});
        map.put("E", new String[]{});
        map.put("F", new String[]{});
        map.put("G", new String[]{});

        costMap.put("A", new Integer[] {1, 1});
        costMap.put("B", new Integer[] {1, 1});
        costMap.put("C", new Integer[] {1, 1});
        costMap.put("D", new Integer[] {1, 1});
        costMap.put("E", new Integer[] {1, 1});
        costMap.put("F", new Integer[] {1, 1});
        costMap.put("G", new Integer[] {1, 1});
    }

    public void addQueue(String start) {
        queue.add(start);
    }

    public void setCountEdge() {
        addQueue("A");

        while(!queue.isEmpty()) {
            String current = queue.poll();
            for (int i = 0; i < map.get(current).length; i++) {
                queue.add(map.get(current)[i]);
            }
            countEdge++;
        }
    }

    public void Dijkstra(String start, String end) {

        bestCost.put(start, 0);

        while (!bestCost.isEmpty()) {

            String current = "";
            int min = Integer.MAX_VALUE;
            for (var i : bestCost.entrySet()) {
                if (i.getValue() < min) {
                    min = i.getValue();
                    current = i.getKey();
                }
            }
            if (current.equals(end)) {
                resultMap.put(current, min);
                break;
            }

            for (int i = 0; i < map.get(current).length; i++) {
                String next = map.get(current)[i];
                int newCost = min + costMap.get(current)[i];
                if (!bestCost.containsKey(next) || bestCost.get(next) > newCost) {
                    bestCost.put(next, newCost);
                }
            }
            bestCost.remove(current);
        }
    }

    public void printResultGraph() {
        for (var i: resultMap.entrySet()) {
            System.out.printf("Кратчайший путь к %s: %d\n", i.getKey(), i.getValue());
        }
    }




    public static void main(String[] args) {

        SixthTask app = new SixthTask();
        app.addGraph();
        app.setCountEdge();

        // Матрица смежности ->
        int edgeSize = app.map.size();
        int vectorSize = app.countEdge;

        int[][] matrix = new int[vectorSize][edgeSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(app.matix[i][j] + " ");
            }
            System.out.println();
        }

        // Поиск кратчайшего пути (Делал через Дейкстру) ->
        app.Dijkstra("A", "G");
        app.printResultGraph();

    }
}
