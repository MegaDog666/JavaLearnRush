package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        try {
            if (url.contains("?")) {
                String[] arr = url.split("\\?");
                String parts[] = arr[1].split("&");
                for (int i = 0; i < parts.length; i++) {
                    String[] pair = parts[i].split("=");
                    if (pair.length == 2) {
                        if (pair[1].contains(".")) {
                            alert(Double.parseDouble(pair[1]));
                        } else {
                            alert(pair[1]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
