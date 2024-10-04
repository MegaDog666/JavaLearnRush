package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static int countSymbols = 0;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0) {
                char symbol = (char) fileInputStream.read();
                if (symbol == ',') {
                    countSymbols++;
                }
            }
            System.out.println(countSymbols);
            fileInputStream.close();
        } catch (IOException e) {

        }
    }
}
