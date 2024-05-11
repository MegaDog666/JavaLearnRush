package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (in.hasNextInt()) {
            int x = in.nextInt();
                if (x < min) {
                    min2 = min;
                    min = x;
                }
                if (x > min && x < min2) {
                    min2 = x;
                }
        }
        System.out.println(min2);
    }
}