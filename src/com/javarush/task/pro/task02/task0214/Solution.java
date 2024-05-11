package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        String third = in.nextLine();

        System.out.println(third);
        System.out.println(second.toUpperCase());
        System.out.println(first.toLowerCase());

    }
}
