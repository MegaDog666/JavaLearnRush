package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        SortedMap <String, Double> result = new TreeMap<>();
        try (BufferedReader fr = new BufferedReader(new FileReader(args[0]))) {
            while (fr.ready()) {
                String[] line = fr.readLine().split(" ");
                String name = line[0];
                double salary = Double.parseDouble(line[1]);
                if (result.containsKey(name)) {
                    salary += result.get(name);
                }
                result.put(name, salary);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Double max = Collections.max(result.values());
        for (String key : result.keySet()) {
            if (result.get(key).equals(max)) {
                System.out.println(key);
            }
        }

    }
}
