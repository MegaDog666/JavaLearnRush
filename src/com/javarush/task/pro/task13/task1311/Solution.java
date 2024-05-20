package com.javarush.task.pro.task13.task1311;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Успеваемость студентов-3
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        //напишите тут ваш код
//        Set<Map.Entry<String, Double>> entrySet = grades.entrySet();
        for (var key : grades.entrySet()
                ) {
            String name = key.getKey();
            double mark = key.getValue();
            System.out.println(name + " : " + mark);
        }
    }
}
