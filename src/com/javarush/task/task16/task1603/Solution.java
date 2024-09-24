package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
        SpecialThread firstThread = new SpecialThread();
        SpecialThread secondThread = new SpecialThread();
        SpecialThread thirdThread = new SpecialThread();
        SpecialThread fourthThread = new SpecialThread();
        SpecialThread fifthThread = new SpecialThread();
        Thread sixthThread = new Thread(firstThread);
        Thread seventhThread = new Thread(secondThread);
        Thread eighthThread = new Thread(thirdThread);
        Thread ninthThread = new Thread(fourthThread);
        Thread tenthThread = new Thread(fifthThread);

        list.add(sixthThread);
        list.add(seventhThread);
        list.add(eighthThread);
        list.add(ninthThread);
        list.add(tenthThread);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
