package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();

            try (BufferedReader fr = new BufferedReader(new FileReader(firstFileName));
                 BufferedWriter fw = new BufferedWriter(new FileWriter(secondFileName))) {
                while (fr.ready()) {
                    String line = fr.readLine();
                    fw.write(line.replaceAll("\\p{P}", ""));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
