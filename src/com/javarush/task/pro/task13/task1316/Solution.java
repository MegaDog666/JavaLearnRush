package com.javarush.task.pro.task13.task1316;


public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (int i = 0; i < javarushQuests.length; i++) {
            System.out.println(JavarushQuest.values()[i].ordinal());
        }
    }
}
