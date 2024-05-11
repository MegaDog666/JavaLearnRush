package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();
        int thirdValue = in.nextInt();

        int average = (firstValue + secondValue + thirdValue) / 3;

        System.out.println(average);

    }
}
