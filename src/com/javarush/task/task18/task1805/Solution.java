package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Set<Integer> set = new TreeSet<>();
        while (fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }
        fileInputStream.close();
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
