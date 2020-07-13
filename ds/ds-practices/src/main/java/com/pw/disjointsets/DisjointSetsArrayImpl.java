package com.pw.disjointsets;

import java.util.Arrays;

public class DisjointSetsArrayImpl {

    private int[] parent;

    private int numOfSets;

    //Initially the we consider parent array index is the sets and
    // values are the parent/representative/root of the sets
    public void makeSet(int numOfSets){
        this.numOfSets = numOfSets;
        this.parent = new int[numOfSets];
        for(int i=0;i<numOfSets;i++){
            parent[i] = i;
        }
    }

    // when we want to create a relation/union from x to y
    // will change parent value based on the highest index
    public void union(int x, int y){

        if(x>y){
            if(parent[y]==y){
                this.parent[y] = x;
            }else{
                union(x,parent[y]);
            }

        }
        else{
            if(parent[x] == x){
                this.parent[x] = y;
            }else{
                this.union(parent[x],y);
            }

        }

    }

    // whenever we are finding the root/parent/representative of the element
    // will search the parent array until the element and it's parent both are same
    public int find(int x){
        if(parent[x] == x)
            return x;
        else
            return find(parent[x]);
    }

    @Override
    public String toString() {
        return "{" +
                "parent=" + Arrays.toString(parent) +
                '}';
    }
}
