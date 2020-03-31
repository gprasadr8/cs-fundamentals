package com.pw.graphs;

public class AdjacencyMatrixGraphApp {
    public static void main(String[] args) {
        UndirectedGraphAdjacencyMatrix graph = new UndirectedGraphAdjacencyMatrix(5);
        graph.print();
        System.out.println("---------------------------------------");
        graph.addEdge(0,2);
        graph.print();
        System.out.println("==============================================");
        System.out.println("Directed Graph Adjacency Matrix");
        DirectedGraphAdjacencyMatrix directedGraph = new DirectedGraphAdjacencyMatrix(5);
        System.out.println("----------------Before Adding Edges--------------------");
        directedGraph.print();
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1,3);
        directedGraph.addEdge(2, 4);

        System.out.println("----------------After Adding Edges--------------------");
        directedGraph.print();

        System.out.println("==============================================");
        System.out.println("Weighted Graph Adjacency Matrix");
        WeightedGraphAdjacencyMatrix weightededGraph = new WeightedGraphAdjacencyMatrix(5);
        System.out.println("----------------Before Adding Edges--------------------");
        weightededGraph.print();
        weightededGraph.addEdge(0, 2,5);
        weightededGraph.addEdge(1,3,10);
        weightededGraph.addEdge(2, 4,15);
        System.out.println("----------------After Adding Edges--------------------");
        weightededGraph.print();
    }
}
