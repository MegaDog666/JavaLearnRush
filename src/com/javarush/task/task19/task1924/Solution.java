package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static
    {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

                while (fileReader.ready()) {
                    String line = fileReader.readLine();
                    String[] words = line.split("\\b");

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].matches("\\d+")) {
                            int number = Integer.parseInt(words[i]);
                            switch (number) {
                                case 0: words[i] = map.get(number); break;
                                case 1: words[i] = map.get(number); break;
                                case 2: words[i] = map.get(number); break;
                                case 3: words[i] = map.get(number); break;
                                case 4: words[i] = map.get(number); break;
                                case 5: words[i] = map.get(number); break;
                                case 6: words[i] = map.get(number); break;
                                case 7: words[i] = map.get(number); break;
                                case 8: words[i] = map.get(number); break;
                                case 9: words[i] = map.get(number); break;
                                case 10: words[i] = map.get(number); break;
                                case 11: words[i] = map.get(number); break;
                                case 12: words[i] = map.get(number); break;
                            }

                            System.out.print(words[i]);
                            continue;
                        }
                        System.out.print(words[i] + " ");
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
