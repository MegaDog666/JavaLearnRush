package com.javarush.Algorithms;

import java.util.HashMap;
public class EighthTask {

    HashMap<Integer, String> map = new HashMap<>();

    public void addMap(int key, String value) {
        map.put(key, value);
    }

    public void compare() {
        HashMap<Integer, String> copyMap = new HashMap<>(map);
        for (var i: copyMap.entrySet()) {
            if (i.getKey() % 2 == 0) {
                map.remove(i.getKey(), i.getValue());
            }
        }
    }

    public void printMap(HashMap<Integer, String> map) {
        for (var i: map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public static void main(String[] args) {
        var app = new EighthTask();
        app.addMap(1, "Java");
        app.addMap(2, "C++");
        app.addMap(3, "PHP");
        app.addMap(4, "JavaScript");
        app.compare();
        app.printMap(app.map);
    }
}
