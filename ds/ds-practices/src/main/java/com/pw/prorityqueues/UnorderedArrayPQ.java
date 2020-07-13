package com.pw.prorityqueues;

import java.util.Arrays;

public class UnorderedArrayPQ {

    private PQNode[] pqueue;

    private int length;

    private int capacity = 10;

    public UnorderedArrayPQ(){
        this.pqueue = new PQNode[this.capacity];
        this.length = -1;
    }

    public void insert(int priority, int data){
        PQNode pqNode = new PQNode(priority, data);
        if(this.size() == this.capacity ){
            resizeArray();
        }
        pqueue[++this.length] = pqNode;
    }

    public int getMaximum(){
        return this.getMaxPriorityNode().data;
    }

    public int getMinimum(){
        return this.getMinPriorityNode().data;
    }

    public int deleteMaximum(){
        PQNode maxNode = this.getMaxPriorityNode();
        this.deleteNode(maxNode);
        return maxNode.data;
    }

    public int deleteMinimum(){
        PQNode minNode = this.getMinPriorityNode();
        deleteNode(minNode);
        return minNode.data;
    }


    private void deleteNode(PQNode deleteNode){
        for(int i=0;i<this.size();i++){
            if(pqueue[i] == deleteNode){
                pqueue[i] = null;
                for(int j=i+1;j<this.size();j++){
                    pqueue[j-1] = pqueue[j];
                }
                this.length--;
                break;
            }
        }
    }


    private PQNode getMaxPriorityNode(){
        PQNode maxPriorityNode = pqueue[0];
        for(int i=1;i<this.size();i++){
            if(maxPriorityNode.priority>pqueue[i].priority){
                maxPriorityNode = pqueue[i];
            }
        }
        return maxPriorityNode;
    }

    private PQNode getMinPriorityNode(){
        PQNode minPriorityNode = pqueue[0];
        for(int i=1;i<this.size();i++){
            if(minPriorityNode.priority<pqueue[i].priority){
                minPriorityNode = pqueue[i];
            }
        }
        return minPriorityNode;
    }

    private void resizeArray() {
        int newSize = this.size()*2;
        PQNode[] resizedQueue = new PQNode[newSize];
        for(int i =0; i<this.size(); i++){
            resizedQueue[i] = pqueue[i];
        }
        this.capacity = newSize;
        this.pqueue = resizedQueue;
    }

    public int size(){
        return this.length+1;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[");
        for(int i=0;i<this.size();i++){
            res.append(pqueue[i].toString());
            if(i!=this.size()-1){
                res.append(",\n");
            }
        }
        res.append("]");
        return res.toString();
    }
}
