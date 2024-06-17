package com.javarush.Algorithms.Final;

import java.util.HashMap;
public class SeventhTask {

    HashMap<String, Integer> weightMap = new HashMap<>();

    HashMap<String, Integer> costMap = new HashMap<>();

    int[] bag = {1, 2, 3, 4};

    HashMap<String, Integer> resultMap = new HashMap<>();

    public void tableCost() {
        /* Guitar -> 1 weight -> 1500$
         * Magnification -> 4 weight -> 3000$
         * Laptop -> 3 weight -> 2000$
         */

        weightMap.put("Guitar", 1);
        weightMap.put("Magnification", 4);
        weightMap.put("Laptop", 3);
        weightMap.put("iPhone", 1);

        costMap.put("Guitar", 1500);
        costMap.put("Magnification", 3000);
        costMap.put("Laptop", 2000);
        costMap.put("iPhone", 3000);
    }

    public void dynamicProgramming() {
        tableCost(); // initialize weightMap and costMap

        int[][] dp = new int[bag.length + 1][weightMap.size() + 1];

        for (int i = 1; i <= bag.length; i++) {
            for (int j = 1; j <= weightMap.size(); j++) {
                int currentWeight = weightMap.get(j - 1);
                int currentCost = costMap.get(j - 1);

                if (currentWeight > i) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - currentWeight][j - 1] + currentCost);
                }
            }
        }

        int max = dp[bag.length][weightMap.size()];
        int weight = 0;

        for (int i = weightMap.size(); i >= 1; i--) {
            if (dp[bag.length][i] != dp[bag.length][i - 1]) {
                weight += weightMap.get(i - 1);
                resultMap.put(weightMap.keySet().toArray()[i - 1].toString(), max);
                max -= costMap.get(i - 1);
            }
        }

        resultMap.put("Total weight", weight);
    }


    public void printGraph() {
        for (var i: resultMap.entrySet()) {
            System.out.printf("Самая лучшая кража: %d\n", i.getValue());
        }
    }

    public static void main(String[] args) {

        SeventhTask app = new SeventhTask();
        app.tableCost();
        app.dynamicProgramming();
        app.printGraph();
    }
}
