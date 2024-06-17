package com.javarush.Algorithms.Final;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class FirstTask {

    HashMap<String, String[]> map = new HashMap<>();
    Queue<String> queue = new LinkedList<>();

    static int countAttemp = 0;

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
    }

    public void addQueue(String start) {
        queue.add(start);
    }

    public void printGraph() {
        for (var i: map.entrySet()) {
            System.out.print(i.getKey() + ": ");
            for (int j = 0; j < i.getValue().length; j++) {
                System.out.print(i.getValue()[j] + " ");
            }
            System.out.println();
        }
    }

    public void Search(String start, String end) {
        /*
              A
            /   \
           C      B
          / \    / \
         G    F E   D


         */
        addQueue(start);

        while(!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(end)) {
                System.out.println("Yes");
                break;
            }
//            countAttemp++;
            for (int i = 0; i < map.get(current).length; i++) {
                queue.add(map.get(current)[i]);

            }

        }
    }
    public static void main(String[] args) {
        FirstTask graph = new FirstTask();
        graph.addGraph();
        graph.printGraph();
        graph.Search("A", "F");
//        System.out.println("Кратчайший путь: " + countAttemp);
    }
}


