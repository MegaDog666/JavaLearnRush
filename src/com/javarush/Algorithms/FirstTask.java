package com.javarush.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstTask {

    Integer countWords = 0;

    ArrayList<String> list = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();

    public void countWords() {
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Hi");
        list.add("World");
        for (var i: list) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
    }

    public void printMap (HashMap<String, Integer> map) {
        for (var i: map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }



    public static void main(String[] args) {
        FirstTask app = new FirstTask();
        app.countWords();
        app.printMap(app.map);
    }
}
