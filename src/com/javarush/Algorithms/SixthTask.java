package com.javarush.Algorithms;

import java.util.HashMap;
public class SixthTask {

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

    public void compare() {
        for (var i : firstMap.entrySet()) {
            for (var j: secondMap.entrySet()) {
                if (i.getKey().equals(j.getKey()) || i.getValue().equals(j.getValue())) {
                    System.out.println(i.getKey() + ": " + i.getValue() + "; " + j.getKey() + ": " + j.getValue());
                    System.out.println("Есть совпадающие ключи или значения");
                    System.out.println();
                } else {
                    System.out.println(i.getKey() + ": " + i.getValue() + "; " + j.getKey() + ": " + j.getValue());
                    System.out.println("Нет совпадающих ключей или значений");
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        var app = new SixthTask();
        app.addMap();
        app.compare();
    }
}
