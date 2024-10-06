package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fileName);
            List<String> list = new ArrayList<>(5);
            String content = "";
            if (args.length > 0 && args[0].equals("-c")) {
                String productName = args[1];
                String productPrice = args[2];
                String productCount = args[3];
                while (fileReader.ready()) {
                    for (int i = 0; i < list.size(); i++) {
                        content += i + productName + productPrice + productCount + "\n";
                        list.add(content);
                        content = "";
                    }
                }
                while (fileReader.ready()) {
                    for (int i = 0; i < list.size(); i++) {
                        fileWriter.write(list.get(i));
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
