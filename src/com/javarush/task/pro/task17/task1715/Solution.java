package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        MusicalInstrument firstOrgan = new Organ();
        MusicalInstrument firstPiano = new Piano();
        MusicalInstrument secondPiano = new Piano();
        MusicalInstrument thirdPiano = new Piano();

        orchestra.add(firstOrgan);
        orchestra.add(firstPiano);
        orchestra.add(secondPiano);
        orchestra.add(thirdPiano);
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        MusicalInstrument firstViolin = new Violin();
        MusicalInstrument secondViolin = new Violin();
        MusicalInstrument firstGuitar = new Guitar();

        orchestra.add(firstViolin);
        orchestra.add(secondViolin);
        orchestra.add(firstGuitar);
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for (MusicalInstrument musicalInstrument : orchestra) {
            musicalInstrument.play();
        }
    }
}
