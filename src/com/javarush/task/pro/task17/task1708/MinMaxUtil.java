package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код

    public static int min(int a, int b) {
        return Math.min(b, a);
    }
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(a, b), c), Math.min(d, e));
    }

    public static int max(int a, int b) {
        return Math.max(b, a);
    }
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(a, b), c), Math.max(d, e));
    }
}
