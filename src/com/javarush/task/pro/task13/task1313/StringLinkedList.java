package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
//        напишите тут ваш код
//        var newNode = new Node();
//        newNode.value = value;
//        newNode.prev = last;
//        newNode.next = null;
//        last.next = newNode;
//        last = newNode;
//        if (first.next == null) {
//            first.next = newNode;
//        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
