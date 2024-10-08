package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Только по-очереди!
*/

public class Solution {

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t1.printResult();
        t2.printResult();

    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        List<String> list = new ArrayList<>();
        public void run() {
            String symbol = "";
            try {
                for (int i = 0; i < 3; i++) {
                    symbol = reader.readLine();
                    list.add(symbol);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
        }
    }
}

