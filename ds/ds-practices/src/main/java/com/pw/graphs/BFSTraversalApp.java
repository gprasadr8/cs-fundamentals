package com.pw.graphs;

import java.util.List;

public class BFSTraversalApp {

    public static void main(String[] args) {
        BFSTraversal bfsTraversal = new BFSTraversal(new char[]{'A', 'B', 'C', 'D', 'E'},false);
        bfsTraversal.addEdge('A','B');
        bfsTraversal.addEdge('A','C');
        bfsTraversal.addEdge('B','D');
        bfsTraversal.addEdge('C','D');

        System.out.println("BFS Traversal with root A");
        List<Character> result = bfsTraversal.getBFSTraversalResult('A');
        System.out.println(result);
        System.out.println("--------------------------");

        System.out.println("BFS Traversal with root B");
        List<Character> bResult = bfsTraversal.getBFSTraversalResult('B');
        System.out.println(bResult);
        System.out.println("--------------------------");

        System.out.println("BFS Traversal with root D");
        List<Character> dResult = bfsTraversal.getBFSTraversalResult('D');
        System.out.println(dResult);

        System.out.println("===============Directed graph======================");
        BFSTraversal directedGraphBFS = new BFSTraversal(new char[]{'A', 'B', 'C', 'D', 'E'},true);
        directedGraphBFS.addEdge('A','B');
        directedGraphBFS.addEdge('A','C');
        directedGraphBFS.addEdge('B','D');
        directedGraphBFS.addEdge('C','D');
        System.out.println("BFS Traversal with root A");
        List<Character> dirAResult = directedGraphBFS.getBFSTraversalResult('A');
        System.out.println(dirAResult);
        System.out.println("--------------------------");

        System.out.println("BFS Traversal with root B");
        List<Character> dirBResult = directedGraphBFS.getBFSTraversalResult('B');
        System.out.println(dirBResult);
        System.out.println("--------------------------");

        System.out.println("BFS Traversal with root D");
        List<Character> dirDResult = directedGraphBFS.getBFSTraversalResult('D');
        System.out.println(dirDResult);

    }
}
