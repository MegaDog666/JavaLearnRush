package com.javarush.task.task18.task1819;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            ArrayList<Integer> list = new ArrayList<>();

            FileInputStream fileInputStream = new FileInputStream(fileName1);
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            FileInputStream fileInputStream2 = new FileInputStream(fileName2);
            FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }

            for (int i = 0; i < list.size(); i++) {
                fileOutputStream.write(list.get(i));
            }

            fileInputStream2.close();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
