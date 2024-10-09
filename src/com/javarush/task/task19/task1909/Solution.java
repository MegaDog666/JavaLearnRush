package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
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
                         if (line.contains(".")) {
                             fw.write(line.replace(".", "!"));
                         }
                     }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
