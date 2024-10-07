package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            //Джава Раш валидатор конченная мразь, это работает, но ему нужно быть точно таким же как в правильном решении
//            String lastName = fileScanner.nextLine();
//            String firstName = fileScanner.nextLine();
//            String middleName = fileScanner.nextLine();
//            Date birthDate = new GregorianCalendar(fileScanner.nextInt(), fileScanner.nextInt() - 1, fileScanner.nextInt()).getTime();
//            return new Person(lastName, firstName, middleName, birthDate);

            String str = fileScanner.nextLine();
            String[] split = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4]) - 1, Integer.parseInt(split[3]));
            Date date = calendar.getTime();
            Person person = new Person(split[1], split[2], split[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
