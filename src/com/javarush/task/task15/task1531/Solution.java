package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here

        if (n > 0) {
            BigDecimal res = new BigDecimal(1);
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigDecimal.valueOf(i));
            }
            return res.toString();
        } else if (n == 0) {
            return "1";
        }

        return "0";
    }
}
