package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            synchronized (notes) {
                notes.add(index, note);
            }
        }

        public void removeNote(int index) {
            synchronized (notes) {
                String note = notes.remove(index);
            }
        }
    }

}
