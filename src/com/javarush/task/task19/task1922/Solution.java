package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    public static int count = 0;

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fr = new BufferedReader(new FileReader(fileName))) {

                while (fr.ready()) {
                    String line = fr.readLine();
                    String[] wordsSplit = line.split(" ");

                    for (int i = 0; i < wordsSplit.length; i++) {
                        for (int j = 0; j < words.size(); j++) {
                            if (wordsSplit[i].equals(words.get(j))) count++;
                        }
                    }
                    if (count == 2) {
                        System.out.println(line);
                    }
                    count = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
