package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {

        Set<Character> englishLetters = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        try (FileReader fileReader = new FileReader(args[0])) {
            int count = 0;
            while (fileReader.ready()) {
                char ch = (char) fileReader.read();
                if (englishLetters.contains(Character.toLowerCase(ch))) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
