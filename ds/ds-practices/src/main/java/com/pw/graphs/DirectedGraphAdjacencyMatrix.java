package com.pw.graphs;

public class DirectedGraphAdjacencyMatrix {

    private int numOfVertices;

    private int[][] adj;

    public DirectedGraphAdjacencyMatrix(int numOfVertices){
        this.numOfVertices = numOfVertices;
        this.adj = new int[numOfVertices][numOfVertices];
    }

    public void addEdge(int src, int des){
        adj[src][des] = 1;
    }

    public void print(){
        for(int i=0;i<numOfVertices;i++) {
            for (int j = 0; j < numOfVertices; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}
