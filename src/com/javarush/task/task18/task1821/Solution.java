package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(args[0])) {
            int[] chars = new int[128];
            while (reader.ready()) {
                chars[reader.read()]++;
            }
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 0) {
                    System.out.println((char) i + " " + chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
