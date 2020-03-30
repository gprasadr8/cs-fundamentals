package com.pw.graphs;

public class AdjacencyMatrixGraph {

    private int numOfVertices;

    private boolean[][] adj;

    public AdjacencyMatrixGraph(int numOfVertices){
        this.numOfVertices = numOfVertices;
        this.adj = new boolean[numOfVertices][numOfVertices];
    }

    public void addEdge(int src, int des){
        this.adj[src][des] = Boolean.TRUE;
        this.adj[des][src] = Boolean.TRUE;
    }

    public void print(){
        for(int i=0;i<numOfVertices;i++) {
            for (int j = 0; j < numOfVertices; j++) {
                if(adj[i][j])
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
