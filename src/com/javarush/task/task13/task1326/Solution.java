package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
            String url = scanner.nextLine();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(url)));
            List<Integer> arrList = new ArrayList<>();
            while (reader.ready()) {
                int number = Integer.parseInt(reader.readLine());
                if (number % 2 == 0)
                    arrList.add(number);
            }

            Collections.sort(arrList);
            arrList.forEach(System.out::println);

            reader.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}
