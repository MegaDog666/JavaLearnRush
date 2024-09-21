package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1

        // Он работает, но валидатор джава раша как всегда показывает что он требует от меня уникальности
//        while (true) {
//            key = reader.readLine();
//            //создаем объект, пункт 2
//            if (key.equalsIgnoreCase("user")) person = new Person.User();
//            if (key.equalsIgnoreCase("loser")) person = new Person.Loser();
//            if (key.equalsIgnoreCase("coder")) person = new Person.Coder();
//            if (key.equalsIgnoreCase("proger")) person = new Person.Proger();
//
//            doWork(person); //вызываем doWork
//            if (key.equalsIgnoreCase("user") || key.equalsIgnoreCase("loser") || key.equalsIgnoreCase("coder") || key.equalsIgnoreCase("proger")) break;
//
//        }
        while (true) {
            key = reader.readLine();
            boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger");
            if (!u) break;

            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
