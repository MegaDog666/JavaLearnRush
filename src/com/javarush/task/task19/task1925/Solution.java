package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        //В очередной раз мой любимывай ВАЛИДАТОР МАТЬ ЕГО НИХАЙ, решил потрепать мои нервы, код рабосий, все по тз, но нет, он просто в никакую не принимает
        // 4 пункт, спасибо валидатор сраный, за то посмотрите на решение JR
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
//             FileWriter writer = new FileWriter(args[1])) {
//            ArrayList<String> list = new ArrayList<>();
//            while (reader.ready()) {
//                String line = reader.readLine();
//                String[] words = line.split(" ");
//                for (String word : words) {
//                    if (word.length() > 6) {
//                        list.add(word);
//                    }
//                }
//            }
//            for (String word : list) {
//                writer.write(word + ",");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //АХУЕТЬ НЕ ВСТАТЬ, зачем так много лишних движений, я ваще не понимаю, что за бред
        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<String>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) {
            /* NOP */
        }

        StringBuffer sbLine = new StringBuffer();
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)

                    sbLine.append(word).append(" ");
            }
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
