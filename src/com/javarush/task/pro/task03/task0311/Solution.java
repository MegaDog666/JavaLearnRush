package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
        //напишите тут ваш код
        System.out.println("числа не равны");
        }
    }
}
