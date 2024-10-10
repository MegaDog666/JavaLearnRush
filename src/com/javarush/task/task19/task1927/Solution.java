package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPSout = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(new PrintStream(byteArrayOutputStream) {
            int count = 1;
            @Override
            public void println(String x) {
                if (count % 3 == 0) {
                    super.println("JavaRush - курсы Java онлайн");
                    count = 1;
                }
                super.println(x);
                count++;
            }
        });
        testString.printSomething();
        System.setOut(defaultPSout);
        System.out.println(byteArrayOutputStream);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
