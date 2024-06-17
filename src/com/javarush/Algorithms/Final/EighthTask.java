package com.javarush.Algorithms.Final;

public class EighthTask {

    public static void main(String[] args) {
        int firstSum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++)
            firstSum += array[i];
        System.out.println(firstSum);
        int secondSum = 0;
        int[] secondArray = {5, 10, 6, 3, 100, 5, 7, 9, 10, 25};
        for (int i = 0; i < array.length; i++)
            secondSum += secondArray[i];
        System.out.println(secondSum);
        if (firstSum > secondSum) {
            System.out.println("Первый массив больше второго");
        } else if (firstSum < secondSum) {
            System.out.println("Второй массив больше первого");
        } else {
            System.out.println("Оба массива равны");
        }
    }
}
