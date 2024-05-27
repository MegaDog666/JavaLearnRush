package com.javarush.Algorithms;

import java.util.HashMap;
public class FifthTask {

    HashMap<String, Integer> firstMap = new HashMap<>();
    HashMap<String, Integer> secondMap = new HashMap<>();
    HashMap<String, Integer> thirdMap = new HashMap<>();

    public void addMap() {
        firstMap.put("Java", 1);
        firstMap.put("C++", 2);
        firstMap.put("PHP", 3);
        firstMap.put("JavaScript", 10);
        secondMap.put("Java", 1);
        secondMap.put("C++", 2);
        secondMap.put("Python", 7);
        secondMap.put("JavaScript", 10);
        thirdMap.put("Java", 1);
        thirdMap.put("C++", 2);
        thirdMap.put("Python", 7);
        thirdMap.put("JavaScript", 10);
    }
    public void result(HashMap<String, Integer> resultMap) {
        resultMap.putAll(firstMap);
        resultMap.putAll(secondMap);
        resultMap.putAll(thirdMap);

        for (var i: firstMap.entrySet()) {
            for (var j: secondMap.entrySet()) {
                for (var k : thirdMap.entrySet()) {
                    if(i.getKey().equals(j.getKey()) && i.getKey().equals(k.getKey()) && j.getKey().equals(k.getKey())) {
                        int value = i.getValue() + j.getValue() + k.getValue();
                        resultMap.put(i.getKey(), value);
                    }
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
        var app = new FifthTask();
        HashMap<String, Integer> resultMap = new HashMap<>();

        app.addMap();
        app.result(resultMap);
        app.printMap(resultMap);
    }
}
