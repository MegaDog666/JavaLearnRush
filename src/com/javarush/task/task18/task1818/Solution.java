package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();

            // Потоки записи
            FileOutputStream firstFileOutputStream = new FileOutputStream(fileName1);

            // Потоки чтения
            FileInputStream secondFileInputStream = new FileInputStream(fileName2);
            FileInputStream thirdFileInputStream = new FileInputStream(fileName3);

            while (secondFileInputStream.available() > 0) {
                firstFileOutputStream.write(secondFileInputStream.read());
            }

            while (thirdFileInputStream.available() > 0) {
                firstFileOutputStream.write(thirdFileInputStream.read());
            }

            // Закрытие потоков
            firstFileOutputStream.close();
            secondFileInputStream.close();
            thirdFileInputStream.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
