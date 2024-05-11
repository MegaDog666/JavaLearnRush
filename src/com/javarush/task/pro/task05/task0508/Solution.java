package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String[] stringTwo = new String[6];
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.nextLine();
            stringTwo[i] = strings[i];
        }
        for (int i = 0; i < stringTwo.length; i++) {
            for (int j = 0; j < stringTwo.length; j++) {
                if (stringTwo[i].equals(stringTwo[j]) && i != j) {
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
