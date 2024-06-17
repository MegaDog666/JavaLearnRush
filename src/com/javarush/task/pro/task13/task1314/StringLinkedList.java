package com.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //напишите тут ваш код
        if (index < 0 || index >= size()) {
            return null;
        }
        Node node = first.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    private int size() {
        int size = 0;
        Node node = first.next;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
