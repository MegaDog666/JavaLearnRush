package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double a = 0.0d;
        double b = 100.0d;
        double c = -100.0d;
        div(a, b);
        div(a, c);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
