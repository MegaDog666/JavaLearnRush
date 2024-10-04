package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static List<Byte> fileBytes = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            FileInputStream firstFileInputStream = new FileInputStream(firstFileName);
            FileOutputStream secondFileOutputStream = new FileOutputStream(secondFileName);

            while (firstFileInputStream.available() > 0) {
                byte[] bytes = new byte[firstFileInputStream.available()];
                firstFileInputStream.read(bytes);
                for (int i = 0; i < bytes.length; i++) {
                    fileBytes.add(bytes[i]);
                }

                Collections.reverse(fileBytes);

                byte[] bytesReverse = new byte[fileBytes.size()];
                for (int i = 0; i < bytesReverse.length; i++) {
                    bytesReverse[i] = fileBytes.get(i);
                }
                secondFileOutputStream.write(bytesReverse);
            }

            firstFileInputStream.close();
            secondFileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
