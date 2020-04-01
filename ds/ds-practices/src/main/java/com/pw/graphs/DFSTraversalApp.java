package com.pw.graphs;

public class DFSTraversalApp {

    public static void main(String[] args) {
        DFSTraversal dfsTraversal = new DFSTraversal(new int[]{1,2,3,4,5});
        dfsTraversal.addEdge(1, 2);
        dfsTraversal.addEdge(1, 3);
        dfsTraversal.addEdge(2, 4);
        dfsTraversal.addEdge(2, 3);
        dfsTraversal.addEdge(3, 5);
        dfsTraversal.addEdge(4, 5);
        dfsTraversal.addEdge(1, 5);
        System.out.println("Graph");
        dfsTraversal.display();

        System.out.println("----------DFS Traversal with root -1 ----------------");
        System.out.println(dfsTraversal.getDFSTraversalResult(1));

        System.out.println("----------DFS Traversal with root -5 ----------------");
        System.out.println(dfsTraversal.getDFSTraversalResult(5));

    }
}
