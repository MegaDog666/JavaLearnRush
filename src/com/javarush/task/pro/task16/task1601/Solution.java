package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(105, 5, 27);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        switch (date.getDay()) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            default:
                return "нет такого дня недели";
        }
    }
}
