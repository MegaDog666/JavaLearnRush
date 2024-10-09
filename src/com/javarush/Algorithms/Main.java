package com.javarush.Algorithms;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {

    static Node root;

    public static void main(String[] args) {
        // Построение исходного дерева
        root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.right.right = new Node(10);


        deleteNode(root, 8);


        insert(root, 4);
        insert(root, 12);
        insert(root, 9);
        insert(root, 18);


        int yourNumber = 22;
        Node foundNode = findNode(root, yourNumber);
        if (foundNode != null) {
            System.out.println("Найден узел с значением: " + foundNode.data);
        } else {
            System.out.println("Узел с данным значением не найден.");
        }


        System.out.println("nIn-order (симметричный обход):");
        inOrderTraversal(root);
        System.out.println("nPre-order (прямой обход):");
        preOrderTraversal(root);
        System.out.println("nPost-order (обратный обход):");
        postOrderTraversal(root);
    }


    static void deleteNode(Node node, int data) {
        if (node == null) {
            return;
        }
        if (data < node.data) {
            deleteNode(node.left, data);
        } else if (data > node.data) {
            deleteNode(node.right, data);
        } else {
            if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node temp = findMax(node.left);
                node.data = temp.data;
                deleteNode(node.left, temp.data);
            }
        }
    }


    static Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    static void insert(Node node, int data) {
        if (data < node.data) {
            if (node.left == null) {
                node.left = new Node(data);
            } else {
                insert(node.left, data);
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new Node(data);
            } else {
                insert(node.right, data);
            }
        }
    }

    static Node findNode(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data == node.data) {
            return node;
        } else if (data < node.data) {
            return findNode(node.left, data);
        } else {
            return findNode(node.right, data);
        }
    }

    static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }


    static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }


    static void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}
