package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString();
        String[] arr = result.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        switch (arr[1]) {
            case "+":
                System.out.printf("%d + %d = %d", a, b, a + b);
                break;
            case "-":
                System.out.printf("%d - %d = %d", a, b, a - b);;
                break;
            case "*":
                System.out.printf("%d * %d = %d", a, b, a * b);
                break;
            default:
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

