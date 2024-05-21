package com.javarush.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class SecondTask {
    HashMap<String, Integer> map = new HashMap<>();
    public void addKey() {
        map.put("Java", 1);
        map.put("C++", 2);
        map.put("Python", 3);
        map.put("JavaScript", 4);
        map.put("PHP", 5);
    }

    public void sortReverse(ArrayList<Integer> value) {
        Collections.sort(value, Collections.reverseOrder());
    }

    public void valueToKey(ArrayList<Integer> value, ArrayList<String> keys) {

        for (int i = 0; i < value.size(); i++) {
            map.put(keys.get(i), value.get(i));
        }
    }

    public static void main(String[] args) {
        SecondTask app = new SecondTask();
        app.addKey();

        ArrayList<String> keys = new ArrayList<>(app.map.keySet());
        ArrayList<Integer> value = new ArrayList<>(app.map.values());

        System.out.print("Сама хеш таблица: ");
        System.out.println(app.map);

        System.out.print("До: ");
        System.out.println(value);

        app.sortReverse(value);
        app.valueToKey(value, keys);

        System.out.print("После: ");
        System.out.println(value);
    }
}

