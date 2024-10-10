package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<String> firstFileItems = new ArrayList<>();
    public static List<String> secondFileItems = new ArrayList<>();


    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            try (BufferedReader ffr = new BufferedReader(new FileReader(firstFileName));
                 BufferedReader sfr = new BufferedReader(new FileReader(secondFileName))) {
                while (ffr.ready()) {
                    String firstLine = ffr.readLine();
                    firstFileItems.add(firstLine);
                }
                while (sfr.ready()) {
                    String secondLine = sfr.readLine();
                    secondFileItems.add(secondLine);
                }

                for (int i = 0; i < firstFileItems.size(); i++) {
                    for (int j = 0; j < secondFileItems.size(); j++) {
                        if (firstFileItems.get(i).equals(secondFileItems.get(j))) {
                            lines.add(new LineItem(Type.SAME, firstFileItems.get(i)));
                        }
                        if (!firstFileItems.get(i).equals(secondFileItems.get(j)) && firstFileItems.size() < secondFileItems.size()) {
                            lines.add(new LineItem(Type.ADDED, secondFileItems.get(j)));
                        }
                        if (!firstFileItems.get(i).equals(secondFileItems.get(j)) && firstFileItems.size() > secondFileItems.size()) {
                            lines.add(new LineItem(Type.REMOVED, firstFileItems.get(i)));
                        }
                    }
                }



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
