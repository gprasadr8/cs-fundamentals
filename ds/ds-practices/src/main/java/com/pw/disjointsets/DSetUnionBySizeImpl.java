package com.pw.disjointsets;


import java.util.Arrays;

public class DSetUnionBySizeImpl {

    private int[] parent;

    private int size;

    public DSetUnionBySizeImpl(int size){
        this.size = size;
        this.parent = new int[this.size];
        //the size of the tree will keep it in -ve values
        //why -ve because we want to set parent index as positive and tree size as -ve
        for(int i=0;i<size;i++){
            this.parent[i] = -1;
        }
    }

    public void union(int x, int y){
        int rootX = this.find(x);
        int rootY = this.find(y);
        if( rootX == rootY){
            return;
        }
        if(parent[rootX] <= parent[rootY]){
            //we have to increase the size of the tree
            this.parent[rootX] +=this.parent[rootY];
            this.parent[rootY] = rootX;
        }else{
            this.parent[rootY] +=this.parent[rootX];
            this.parent[rootX] = rootY;
        }
    }

    public int find(int x) {
        if(this.parent[x] <= -1){
            return x;
        }
        return this.find(this.parent[x]);
    }

    @Override
    public String toString() {
        return "parent=" + Arrays.toString(parent);
    }
}
