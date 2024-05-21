package com.javarush.Algorithms;

import java.util.HashMap;
public class SeventhTask {

    HashMap<Integer, Double> map = new HashMap<>();

    public void addMap(int key, int value) {
        map.put(key, Math.pow(value, 2));
    }
    public void printMap(HashMap<Integer, Double> map) {
        for (var i: map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
    public static void main(String[] args) {
        var app = new SeventhTask();
        app.addMap(1, 2);
        app.addMap(2, 3);
        app.addMap(3, 4);
        app.printMap(app.map);
    }

}
