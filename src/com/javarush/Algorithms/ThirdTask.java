package com.javarush.Algorithms;

import java.util.HashMap;
public class ThirdTask {

    int count = 0;
    static String word = "Аргентина манит негра".toLowerCase().replace(" ", "");
    static String firstHalf = word.substring(0, word.length() / 2);
    static String secondHalf = word.substring(word.length() / 2, word.length());
    HashMap<String, Integer> map = new HashMap<>();

    public void addKey(String[] value) {
        for (int i = 0; i < value.length; i++) {
            map.put(value[i], i);
        }
    }

    public void result(String[] firstHalfArray, String[] secondHalfArray) {
        for (int i = 0; i < map.size(); i++) {
            if (firstHalfArray[i].equals(secondHalfArray[i])) {
                count++;
            }
        }

        if (count == map.size()) {
            System.out.println("Слово палиндром");
        } else {
            System.out.println("Слово не палиндром");
        }
    }
    public static void main(String[] args) {
        var app = new ThirdTask();
        var sb = new StringBuilder(secondHalf);

        secondHalf = sb.reverse().toString();
        String[] firstHalfArray = firstHalf.split("");
        String[] secondHalfArray = secondHalf.split("");

        app.addKey(firstHalfArray);
        app.result(firstHalfArray, secondHalfArray);

    }
}
