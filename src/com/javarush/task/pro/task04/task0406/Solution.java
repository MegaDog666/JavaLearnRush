package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);

        while (true) {
            String str = in.nextLine();
            if (str.equals("enough")) break;
            System.out.println(str);
        }

    }
}