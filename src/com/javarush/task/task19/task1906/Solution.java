package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    static List<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            int k = 1;

            try (FileReader fr = new FileReader(firstFileName);
                 FileWriter fw = new FileWriter(secondFileName)) {
                while (fr.ready()) {
                    int ch = fr.read();
                    if (k++ % 2 == 0) {
                        fw.write(ch);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
