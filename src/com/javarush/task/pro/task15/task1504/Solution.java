package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();

        try (InputStream inputStream = Files.newInputStream(Paths.get(firstFileName));
             OutputStream outputStream = Files.newOutputStream(Paths.get(secondFileName))) {
            while (inputStream.available() > 0) {
                byte[] bytesIn = inputStream.readAllBytes();
                byte[] byresOut = new byte[bytesIn.length];
                for (int i = 0; i < bytesIn.length; i += 2) {
                    if (i < bytesIn.length - 1) {
                        byresOut[i] = bytesIn[i + 1];
                        byresOut[i + 1] = bytesIn[i];
                    } else {
                        byresOut[i] = bytesIn[i];
                    }
                }

                outputStream.write(byresOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}