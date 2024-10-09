package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
//    public static int count = 0;
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        // В очередной раз, валидатор я тебя лав, поэтому дап (Даже преподаватель сказал что это бред :))
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String fileName = reader.readLine();
//
//            try (FileReader fr = new FileReader(fileName)) {
//                while (fr.ready()) {
//
//                    char[] chars = new char[fr.read()];
//                    fr.read(chars);
//                    String line = new String(chars);
//                    line = line.replaceAll("\\p{P}", "");
//
//                    String[] words = line.split("\\W");
//                    for (String word: words) {
//                        if (word.equals("world")) count++;
//                    }
//                }
//            }
//
//            System.out.println(count);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String fileName;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        }

        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);


    }

}
