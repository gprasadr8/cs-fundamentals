package com.pw.prorityqueues;

public class UnorderedPQArrayApp {

    public static void main(String[] args) {
        UnorderedArrayPQ unorderedArrayPQ = new UnorderedArrayPQ();
        System.out.println(unorderedArrayPQ);
        System.out.println("size: "+unorderedArrayPQ.size());
        unorderedArrayPQ.insert(1, 25);
        unorderedArrayPQ.insert(5, 30);
        unorderedArrayPQ.insert(1, 60);
        unorderedArrayPQ.insert(2, 40);
        System.out.println(unorderedArrayPQ);
        System.out.println("size: "+unorderedArrayPQ.size());
        System.out.println("delete max node-1");
        unorderedArrayPQ.deleteMaximum();
        System.out.println(unorderedArrayPQ);
        System.out.println("size: "+unorderedArrayPQ.size());
        System.out.println("delete min node-1");
        unorderedArrayPQ.deleteMinimum();
        System.out.println(unorderedArrayPQ);
        System.out.println("size: "+unorderedArrayPQ.size());
    }
}
