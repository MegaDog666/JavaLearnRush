package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int count = 1;
        String str = in.nextLine();
        int number = in.nextInt();

        if (number <= 0 || number >=5) {
            number = 1;
        }


        do {
            System.out.println(str);
            count++;
        } while (count <= number);

    }
}