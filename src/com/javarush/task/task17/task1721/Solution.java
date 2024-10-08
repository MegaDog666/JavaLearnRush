package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstNameFile = reader.readLine();
            String secondNameFile = reader.readLine();
            try (BufferedReader reader1 = new BufferedReader(new FileReader(firstNameFile))) {
                String line;
                while ((line = reader1.readLine()) != null) {
                    allLines.add(line);
                }
            }
            try (BufferedReader reader2 = new BufferedReader(new FileReader(secondNameFile))) {
                String line;
                while ((line = reader2.readLine()) != null) {
                    forRemoveLines.add(line);
                }
            }
            Solution solution = new Solution();
            solution.joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
            if (allLines.containsAll(forRemoveLines)) {
                allLines.removeAll(forRemoveLines);
            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
    }
}

