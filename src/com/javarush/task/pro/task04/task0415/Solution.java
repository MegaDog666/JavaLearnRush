package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        int radius = in.nextInt();
        int S = (int)(pi * radius * radius);
        System.out.println(S);

    }
}