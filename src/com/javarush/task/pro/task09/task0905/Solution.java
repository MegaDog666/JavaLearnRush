package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = -13;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 025;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int octal = 0;
        int i = 0;
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                octal = octal + (decimalNumber % 8) * (int) Math.pow(10, i);
                decimalNumber = decimalNumber / 8;
                i++;
                if (decimalNumber == 0) {
                    return octal;
                }
            }
        } else {
            return 0;
        }
            return 0;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decimal = 0;
        int i = 0;
        if (octalNumber > 0) {
            while (octalNumber != 0) {
                decimal = decimal + (octalNumber % 10) * (int) Math.pow(8, i);
                octalNumber = octalNumber / 10;
                i++;
                if (octalNumber == 0) {
                    return decimal;
                }
            }
        } else {
            return 0;
        }
            return 0;
    }
}
