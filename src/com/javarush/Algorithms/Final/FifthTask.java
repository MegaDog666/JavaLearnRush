package com.javarush.Algorithms.Final;

import java.util.HashMap;
public class FifthTask {

    HashMap <String, String[]> nameMap = new HashMap<>();
    HashMap <String, Integer[]> costMap = new HashMap<>();

    HashMap<String, Integer> bestCost = new HashMap<>();

    HashMap<String, Integer> resultMap = new HashMap<>();

    public void graph() {
        /*
         Book -> Disk # 5$
         Book -> Poster # 0$
         Disk -> BassGuitar # 25$
         Disk -> Drums $ 20$
         BassGuitar -> Piano # 20$
         Poster -> BassGuitar # 30$
         Poster -> Drums # 35$
         Drums -> Piano # 20$
         */

        nameMap.put("Book", new String[] {"Disk", "Poster"});
        nameMap.put("Disk", new String[] {"BassGuitar", "Drums"});
        nameMap.put("BassGuitar", new String[] {"Piano"});
        nameMap.put("Poster", new String[] {"BassGuitar", "Drums"});
        nameMap.put("Drums", new String[] {"Piano"});

        costMap.put("Book", new Integer[] {5, 0});
        costMap.put("Disk", new Integer[] {25, 20});
        costMap.put("BassGuitar", new Integer[] {20});
        costMap.put("Poster", new Integer[] {5, 35});
        costMap.put("Drums", new Integer[] {-10});
    }

    public void Dijkstra(String start, String end) {

        bestCost.put(start, 0);

        while (!bestCost.isEmpty()) {

            String current = "";
            String noAsk = "";
            int min = Integer.MAX_VALUE;
            for (var i : bestCost.entrySet()) {
                if (i.getValue() < min) {
                    min = i.getValue();
                    current = i.getKey();
                    noAsk = i.getKey();
                }
            }
            if (current.equals(end)) {
                resultMap.put(current, min);
                break;
            }

            for (int i = 0; i < nameMap.get(current).length; i++) {
                String next = nameMap.get(current)[i];
                int newCost = min + costMap.get(current)[i];
                if (!bestCost.containsKey(next) || bestCost.get(next) > newCost) {
                    bestCost.put(next, newCost);
                }
            }
            bestCost.remove(current);
        }
    }

    public void printGraph() {
        for (var i: resultMap.entrySet()) {
            System.out.print(i.getKey() + ": " + i.getValue());
        }
    }

    public static void main(String[] args) {
        var app = new FifthTask();
        app.graph();
        app.Dijkstra("Book", "Piano");
        app.printGraph();
    }

}
