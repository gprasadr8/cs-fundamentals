package com.pw.linkedlist.dll;

public class DLLNode {
    public int data;

    public DLLNode prev,next;

    public DLLNode(int data){
        this.data = data;
        this.prev = this.next = null;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    
}
