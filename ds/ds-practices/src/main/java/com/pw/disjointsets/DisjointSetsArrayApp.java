package com.pw.disjointsets;

public class DisjointSetsArrayApp {

    public static void main(String[] args) {
        DisjointSetsArrayImpl disjointSetsArray = new DisjointSetsArrayImpl();

        disjointSetsArray.makeSet(5);
        System.out.println("5 sets array: "+disjointSetsArray);
        disjointSetsArray.union(1, 2);
        System.out.println("After making relation from 1-2 : "+disjointSetsArray);

        System.out.println("find 2's parent/representative/root: "+disjointSetsArray.find(2));

        disjointSetsArray.union(4, 1);
        System.out.println("After making relation from 4-1 : "+disjointSetsArray);

        System.out.println("find 1's parent/representative/root: "+disjointSetsArray.find(1));
        System.out.println("find 4's parent/representative/root: "+disjointSetsArray.find(4));
    }
}
