package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName1);
            FileOutputStream firstFileOutputStream = new FileOutputStream(fileName2);
            FileOutputStream secondFileOutputStream = new FileOutputStream(fileName3);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            while (fileInputStream.available() >= 0) {
                if (bytes.length % 2 == 0) {
                    firstFileOutputStream.write(bytes, 0, bytes.length / 2);
                    secondFileOutputStream.write(bytes, bytes.length / 2, bytes.length - bytes.length / 2);
                } else {
                    firstFileOutputStream.write(bytes, 0, (bytes.length / 2) + 1);
                    secondFileOutputStream.write(bytes, (bytes.length / 2) + 1, bytes.length - (bytes.length / 2) - 1);
                }
                break;
            }

            fileInputStream.close();
            firstFileOutputStream.close();
            secondFileOutputStream.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
