package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        double winter = (int) Math.round(value * 3.6);
        System.out.println((int)winter);
    }
}