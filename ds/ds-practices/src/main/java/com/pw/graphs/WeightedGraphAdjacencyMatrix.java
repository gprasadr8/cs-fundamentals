package com.pw.graphs;

public class WeightedGraphAdjacencyMatrix {

    private int numOfVertices;
    private int[][] adj;

    public WeightedGraphAdjacencyMatrix(int numOfVertices){
        this.numOfVertices = numOfVertices;
        this.adj = new int[numOfVertices][numOfVertices];
    }

    public void addEdge(int src, int des, int weight){
        this.adj[src][des] = weight;
        this.adj[des][src] = weight;
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
