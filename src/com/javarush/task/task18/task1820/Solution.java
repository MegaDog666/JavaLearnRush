package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));

            while (fileReader.ready()) {
                String[] numbers = fileReader.readLine().split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    fileWriter.write(Math.round(Double.parseDouble(numbers[i])) + " ");
                }
                fileWriter.newLine();
            }

            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
