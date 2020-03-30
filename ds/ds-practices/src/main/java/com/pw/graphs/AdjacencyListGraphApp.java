package com.pw.graphs;

public class AdjacencyListGraphApp {

    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.printGraph();
        System.out.println("-----------Integer graph--------------------");
        AdjacencyListGraph charGraph = new AdjacencyListGraph(new char[]{'A','B','C','D','E'});
        System.out.println("---------------------------------------------");
        charGraph.addEdge('A','B');
        charGraph.addEdge('B','D');
        charGraph.addEdge('D','C');
        charGraph.addEdge('C','A');
        System.out.println("-----------Character graph--------------------");
        charGraph.printCharGraph();
        System.out.println("---------------------------------------------");
    }
}
