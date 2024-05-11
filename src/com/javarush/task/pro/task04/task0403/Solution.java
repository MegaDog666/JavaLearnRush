package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String command = in.nextLine();
        while(!command.equals("ENTER")) {
            sum += Integer.parseInt(command);
            command = in.nextLine();
        }
        System.out.println(sum);

    }
}