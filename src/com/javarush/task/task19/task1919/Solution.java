package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        SortedMap<String, Double> result = new TreeMap<>();
        try (BufferedReader fr = new BufferedReader(new FileReader(args[0]))) {
            while(fr.ready()) {
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



        for (String key : result.keySet()) {
            System.out.println(key + " " + result.get(key));
        }
    }
}
