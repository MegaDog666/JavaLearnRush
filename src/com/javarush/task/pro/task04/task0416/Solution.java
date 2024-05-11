package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();

        double result = (firstValue * 1.0 / secondValue);
        System.out.println(result);

    }
}