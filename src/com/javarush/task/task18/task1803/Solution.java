package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int currentByte = fileInputStream.read();
            if (map.containsKey(currentByte)) {
                map.put(currentByte, map.get(currentByte) + 1);
            } else {
                map.put(currentByte, 1);
            }
        }
        fileInputStream.close();
        int maxValueOfHashMap = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxValueOfHashMap) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
