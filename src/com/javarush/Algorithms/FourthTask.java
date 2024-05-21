package com.javarush.Algorithms;


import java.util.HashMap;
public class FourthTask {

    HashMap<String, Integer> firstMap = new HashMap<>();
    HashMap<String, Integer> secondMap = new HashMap<>();

    public void addMap() {
        firstMap.put("Java", 1);
        firstMap.put("C++", 2);
        firstMap.put("PHP", 3);
        firstMap.put("JavaScript", 10);
        secondMap.put("Java", 1);
        secondMap.put("C++", 2);
        secondMap.put("Python", 7);
        secondMap.put("JavaScript", 10);
    }
    public void result(HashMap<String, Integer> resultMap) {
        resultMap.putAll(firstMap);
        resultMap.putAll(secondMap);

        for (var i: secondMap.entrySet()) {
            for (var j: firstMap.entrySet()) {
                if (i.getValue().equals(j.getValue())) {
                    int value = j.getValue() + i.getValue();
                    resultMap.put(i.getKey(), value);
                }
            }
        }

    }

    public void printMap(HashMap<String, Integer> map) {
        for (var i: map.entrySet()) {
            System.out.print(i.getKey() + ": " + i.getValue() + "; ");
        }
    }

    public static void main(String[] args) {
        var app = new FourthTask();
        HashMap<String, Integer> resultMap = new HashMap<>();

        app.addMap();
        app.result(resultMap);
        app.printMap(resultMap);
    }
}
