package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in); BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String fileName = scanner.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                String line = reader.readLine();
                while (!line.equalsIgnoreCase("exit")) {
                    writer.write(line);
                    writer.newLine();
                    line = reader.readLine();
                    if (line.equalsIgnoreCase("exit")) writer.write(line);
                }
                writer.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
