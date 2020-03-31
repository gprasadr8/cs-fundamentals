package com.pw.graphs;

import java.util.*;

public class BFSTraversal {

    private CharVertex[] vertices;

    private int vertexCount;

    private int[][] adj;

    private boolean isDirectedGraph;

    private static final int DEFAULT_NUM_OF_VERTICES = 10;

    private int numOfVertices;

    public BFSTraversal(char[] inputVertices,boolean isDirectedGraph){
        this.numOfVertices = inputVertices.length;
        this.vertices = new CharVertex[this.numOfVertices];
        for(int i=0;i<inputVertices.length;i++){
            this.vertices[i] = new CharVertex(inputVertices[i]);
        }
        this.adj = new int[numOfVertices][numOfVertices];
        this.vertexCount = 0;
        this.isDirectedGraph = isDirectedGraph;
    }

    public void addEdge(char src, char des){
        int srcIndex = getVertexIndex(src);
        int desIndex = getVertexIndex(des);
        if(srcIndex != -1 && desIndex !=-1){
            if(this.isDirectedGraph){
                this.adj[srcIndex][desIndex] = 1;
            }else{
                this.adj[srcIndex][desIndex] = 1;
                this.adj[desIndex][srcIndex] = 1;
            }
        }else {
            throw  new IllegalArgumentException("Invalid Edge has given");
        }
    }

    private int getVertexIndex(char vertex){
        for(int i=0;i<this.vertices.length;i++){
            CharVertex charVertex = this.vertices[i];
            if(charVertex.label == vertex){
                return i;
            }
        }
        return -1;
    }

    public List<Character> getBFSTraversalResult(char root){
        List<Character> result = new ArrayList<>();
        Queue<CharVertex> queue = new LinkedList<>();
        CharVertex rootVertex = getCharVertex(root);
        if(rootVertex == null){
            throw  new IllegalArgumentException("Invalid vertex given to start BFS Traversal");
        }

        rootVertex.visited = true;
        result.add(rootVertex.label);
        queue.offer(rootVertex);

        while (!queue.isEmpty()){
            CharVertex vertex = queue.poll();
            int vertexIndex = getVertexIndex(vertex.label);
            int nextIndex;
            while ((nextIndex = getUnvisitedVertex(vertexIndex))!=-1){
                CharVertex nextVertex = this.vertices[nextIndex];
                nextVertex.visited = true;
                result.add(nextVertex.label);
                queue.offer(nextVertex);
            }
        }
        //setting back to unvisited
        for (int i=0; i<this.vertices.length;i++){
            this.vertices[i].visited = false;
        }
        return result;
    }

    private int getUnvisitedVertex(int vertexIndex) {
        for(int i=0;i<this.vertices.length;i++){
            if(this.adj[vertexIndex][i] == 1 && this.vertices[i].visited ==false){
                return i;
            }
        }

        return -1;
    }

    private CharVertex getCharVertex(char root) {
        for(CharVertex charVertex : this.vertices){
            if(charVertex.label == root)
                return charVertex;
        }
        return null;
    }
}
