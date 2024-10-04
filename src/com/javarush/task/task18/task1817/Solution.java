package com.javarush.task.task18.task1817;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static int countSpaces = 0;
    public static int countChars = 0;
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char ch = (char) fileReader.read();
                if (ch == ' ') {
                    countSpaces++;
                }
                countChars++;
            }
            double result = (double) countSpaces / countChars * 100;
            System.out.println(String.format("%.2f", result));
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
