package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 10; i > 0; i--) {
            int count = 10 - i;
            for (int j = 0; j <= count; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}