package com.javarush.Algorithms.Final.Lesson;

public class Graph {

    private int maxN = 10;
    private int[][] matrix;

    Vertex[] vertexList;
    private int curN;

    myStack stack = new myStack();

    public Graph() {
        vertexList = new Vertex[maxN];
        matrix = new int[maxN][maxN];
        curN = 0;
    }

    public void addVertex(char name) {
        vertexList[curN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val) {
        matrix[start][end] = 1;
        matrix[end][start] = val;
    }

    public int check(int v) {
        for (int i = 0; i < curN; i++) {
            if (matrix[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
         }
        return -1;
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].wasVisited = true;
        stack.push(index);
        while(!stack.isEmpty()) {
            int neigh = check(stack.peek());

            if (neigh == -1) {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].wasVisited = true;
                stack.push(neigh);
            }
        }

        for (int i = 0; i < curN; i++) {
            vertexList[i].wasVisited = false;
        }
    }
}
