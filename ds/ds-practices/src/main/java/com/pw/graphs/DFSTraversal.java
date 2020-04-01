package com.pw.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSTraversal {

    private boolean[] visited;

    private int[] vertices;

    private int[][] adj;

    public DFSTraversal(int[] vertices){
        this.vertices = vertices;
        this.visited = new boolean[vertices.length];
        this.adj = new int[vertices.length][vertices.length];
    }

    public List<Integer> getDFSTraversalResult(int root){
        final List<Integer> res = new ArrayList<>();

        if(getVertexIndex(root) == -1)
            return res;
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        res.add(root);
        while (!stack.isEmpty()){
            int vertex = stack.peek();
            int vertexIndex = this.getVertexIndex(vertex);
            visited[vertexIndex] = true;
            int nextVertexIndex = this.getUnvisitedIndex(vertexIndex);
            if(nextVertexIndex == -1){
                stack.pop();
            }else{
                visited[nextVertexIndex] = true;
                res.add(this.vertices[nextVertexIndex]);
                stack.push(this.vertices[nextVertexIndex]);
            }
        }
        for(int i=0;i<this.visited.length;i++){
            visited[i] = false;
        }
        return res;
    }

    private int getUnvisitedIndex(int vertexIndex) {
        for(int i=0;i<this.vertices.length;i++){
            if(adj[vertexIndex][i] == 1 && !visited[i]){
                return i;
            }
        }
        return -1;
    }

    private int getVertexIndex(int root) {
        for(int i=0;i<this.vertices.length;i++){
            if(this.vertices[i] == root)
                return i;
        }
        return -1;
    }

    public void addEdge(int vertex1, int vertex2){
        int srcVertexIndex = this.getVertexIndex(vertex1);
        int desVertexIndex = this.getVertexIndex(vertex2);
        adj[srcVertexIndex][desVertexIndex] = 1;
        adj[desVertexIndex][srcVertexIndex] = 1;
    }

    public void display(){
        for(int vertex: this.vertices){
            System.out.print("     "+vertex+"");
        }
        System.out.println();
        for(int i=0;i<this.vertices.length;i++){
            System.out.print(" "+this.vertices[i]+"  ");
            for(int j=0;j<this.vertices.length;j++){
                System.out.print(" "+adj[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
