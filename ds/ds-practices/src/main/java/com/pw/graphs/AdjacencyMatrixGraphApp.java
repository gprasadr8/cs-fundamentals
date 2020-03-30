package com.pw.graphs;

public class AdjacencyMatrixGraphApp {
    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
        graph.print();
        System.out.println("---------------------------------------");
        graph.addEdge(0,2);
        graph.print();
    }
}
