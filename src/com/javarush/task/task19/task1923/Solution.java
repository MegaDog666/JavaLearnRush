package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader firstFileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter secondFileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while (firstFileReader.ready()) {
                String line = firstFileReader.readLine();
                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].matches(".*\\d.*")) {
                        secondFileWriter.write(words[i] + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
