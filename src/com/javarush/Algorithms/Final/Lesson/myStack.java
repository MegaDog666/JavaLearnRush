package com.javarush.Algorithms.Final.Lesson;

public class myStack {
    private int size = 10;
    private int top;
    private int[] array;

    public myStack() {
        array = new int[size];
        top = -1;
    }

    public void push(int v) {
        array[++top] = v;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }

    }
}

