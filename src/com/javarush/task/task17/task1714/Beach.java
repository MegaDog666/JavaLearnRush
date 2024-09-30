package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized int compareTo(Beach o) {
        int count = 0;

        if (this.getQuality() > o.getQuality()) {
            count++;
        } if (this.getQuality() < o.getQuality()) {
            count--;
        } if (this.getDistance() < o.getDistance()) {
            count++;
        } if (this.getDistance() > o.getDistance()) {
            count--;
        }
        return count;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("beach1", 1.0f, 1);
        Beach beach2 = new Beach("beach2", 2.0f, 2);
        System.out.println(beach1.compareTo(beach2));
    }
}
