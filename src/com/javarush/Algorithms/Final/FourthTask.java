package com.javarush.Algorithms.Final;

import java.util.HashMap;
public class FourthTask {

    HashMap <String, String[]> nameMap = new HashMap<>();
    HashMap <String, Integer[]> costMap = new HashMap<>();

    HashMap<String, Integer> bestCost = new HashMap<>();

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
        costMap.put("Poster", new Integer[] {30, 35});
        costMap.put("Drums", new Integer[] {20});
    }

    public void Dijkstra(String start, String end) {

        bestCost.put(start, 0);

        while(!bestCost.isEmpty()) {
            String current = bestCost.keySet().iterator().next();
            if (current.equals(end)) {
                break;
            }
            for (int i = 0; i < nameMap.get(current).length; i++) {
                String next = nameMap.get(current)[i];
                Integer cost = costMap.get(current)[i];
                if (bestCost.get(current) + cost < bestCost.get(next)) {
                    bestCost.put(next, bestCost.get(current) + cost);
                }
            }
            bestCost.remove(current);
        }
    }

    public void printGraph() {
        for (var i: bestCost.entrySet()) {
            System.out.print(i.getKey() + ": " + i.getValue() + "; ");
        }
    }

    public static void main(String[] args) {
        var app = new FourthTask();
        HashMap<String, Integer> resultMap = new HashMap<>();
        app.graph();
        app.Dijkstra("Book", "Piano");
        app.printGraph();
    }

}
