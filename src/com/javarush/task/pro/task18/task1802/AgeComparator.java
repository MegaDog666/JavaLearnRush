package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    //напишите тут ваш код

    public int compare (Student studen1, Student student2) {
        return student2.getAge() - studen1.getAge();
    }
}
