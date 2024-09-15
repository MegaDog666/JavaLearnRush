package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate nowDate = LocalDate.now();

        return nowDate;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate ofDate = LocalDate.of(2020, 9, 12);

        return ofDate;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate ofYearDayDate = LocalDate.ofYearDay(2020, 256);

        return ofYearDayDate;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        LocalDate ofEpochDayDate = LocalDate.ofEpochDay(18517);

        return ofEpochDayDate;
    }
}
