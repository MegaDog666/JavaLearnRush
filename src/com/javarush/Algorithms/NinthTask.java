package com.javarush.Algorithms;

import java.util.HashMap;
public class NinthTask {

    HashMap<String, Integer> firstMap = new HashMap<>();
    HashMap<String, Integer> secondMap = new HashMap<>();

    HashMap<String, Integer> resultMap = new HashMap<>();

    public void addMap() {
        firstMap.put("Java", 1);
        firstMap.put("C++", 2);
        firstMap.put("PHP", 3);
        secondMap.put("Java", 1);
        secondMap.put("C++", 2);
        secondMap.put("Python", 7);
    }

    public void compare() {
        for (var i: firstMap.entrySet()) {
            for (var j: secondMap.entrySet()) {
                if (i.getKey().equals(j.getKey())) {
                    int value = i.getValue() * j.getValue();
                    resultMap.put(i.getKey(), value);
                }
            }
        }
    }

    public void printMap(HashMap<String, Integer> map) {
        for (var i: map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public static void main(String[] args) {
        var app = new NinthTask();
        app.addMap();
        app.compare();
        app.printMap(app.resultMap);
    }

}
