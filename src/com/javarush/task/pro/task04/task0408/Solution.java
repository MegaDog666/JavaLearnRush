package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (in.hasNextInt()) {
            int x = in.nextInt();
            if (x > max && x % 2 == 0)
                max = x;

        }
        System.out.println(max);

    }
}