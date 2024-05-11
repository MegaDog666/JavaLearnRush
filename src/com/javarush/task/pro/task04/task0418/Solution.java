package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double glass = 0.5;
        double man;
        //напишите тут ваш код
        boolean variant = in.nextBoolean();
        if (variant)
            man = (int) Math.ceil(glass);
        else
            man = (int) Math.floor(glass);
        System.out.println((int) man);

    }
}