package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();

            try (BufferedReader fr = new BufferedReader(new FileReader(firstFileName));
                 BufferedWriter fw = new BufferedWriter(new FileWriter(secondFileName))) {
                while (fr.ready()) {
                    String line = fr.readLine();
                    String[] numbers = line.split(" ");
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i].matches("\\d+")) {
                            fw.write(numbers[i] + " ");
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
