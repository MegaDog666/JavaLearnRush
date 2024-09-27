package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());

    }

    public static void main(String[] args) {

    }
    public static class FirstThread extends Thread {
        public void run() {
            while (true) {

            }
        }
    }
    public static class SecondThread extends Thread {
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThirdThread extends Thread {

        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }

        }
    }
    public static class FourthThread extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {
            }
        }

        public void showWarning() {
            this.interrupt();
        }
    }
    public static class FifthThread extends Thread {
        public void run() {
            int i = 0;
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String str = reader.readLine();
                    if (str.equals("N")) {
                        System.out.println(i);
                        reader.close();
                        break;
                    }
                    i += Integer.parseInt(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}