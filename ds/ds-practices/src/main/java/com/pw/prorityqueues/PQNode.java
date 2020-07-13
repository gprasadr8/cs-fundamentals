package com.pw.prorityqueues;

public class PQNode {

    public int priority;

    public int data;

    public PQNode(int priority, int data){
        this.priority = priority;
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "priority:" + priority +
                ", data:" + data +
                '}';
    }
}
