package com.javarush.Algorithms.Final;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SecondTask {

    private HashMap<String, String[]> map = new HashMap<>();

    private Queue<String> queue = new LinkedList<>();

    static int countAttemp;

    public void addGraph() {
        /*
         A0 -> B0, A1
         A1 -> A0, A2
         A2 -> A1, B2
         A3 -> B3

         B0 -> A0, B1
         B1 -> B0, C1
         B2 -> A2, B3
         B3 -> A3, B2

         C0 -> C1
         C1 -> B1, D1, C2, C0
         C2 -> C1, C3
         C3 -> C2, D3

         D0 -> D1
         D1 -> D0, C1, D2
         D2 -> D1
         D3 -> C3
         */

        map.put("A0", new String[]{"B0", "A1"});
        map.put("A1", new String[]{"A0", "A2"});
        map.put("A2", new String[]{"A1", "B2"});
        map.put("A3", new String[]{"B3"});

        map.put("B0", new String[]{"A0", "B1"});
        map.put("B1", new String[]{"B0", "C1"});
        map.put("B2", new String[]{"A2", "B3"});
        map.put("B3", new String[]{"A3", "B2"});

        map.put("C0", new String[]{"C1"});
        map.put("C1", new String[]{"B1", "D1", "C2", "C0"});
        map.put("C2", new String[]{"C1", "C3"});
        map.put("C3", new String[]{"C2", "D3"});

        map.put("D0", new String[]{"D1"});
        map.put("D1", new String[]{"D0", "C1", "D2"});
        map.put("D2", new String[]{"D1"});
        map.put("D3", new String[]{"C3"});
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

    public void addQueue(String start) {
        queue.add(start);
    }

    public void search(String start, String end) {
        addQueue(start);

        while(!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(end)) {
                System.out.println("Yes");
                return;
            }
            for (int i = 0; i < map.get(current).length; i++) {
                queue.add(map.get(current)[i]);
            }
//            countAttemp++;
        }
    }

    public static void main(String[] args) {

        SecondTask graph = new SecondTask();
        graph.addGraph();
        graph.printGraph();
        graph.search("A0", "A1");
//        System.out.println("Кратчайший путь: " + countAttemp);

    }
}
