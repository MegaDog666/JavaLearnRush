package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fr = new BufferedReader(new FileReader(fileName))) {
                while(fr.ready()) {
                    String line = fr.readLine();
                    System.out.println(new StringBuilder(line).reverse());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
