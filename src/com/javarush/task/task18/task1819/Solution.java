package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            FileInputStream fileInputStream1 = new FileInputStream(fileName1);
            FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
            FileInputStream fileInputStream2 = new FileInputStream(fileName2);
            while (fileInputStream1.available() / 2 > 0) {

                fileOutputStream.write(fileInputStream2.read());
            }

            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
            fileInputStream2.close();
            fileInputStream1.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
