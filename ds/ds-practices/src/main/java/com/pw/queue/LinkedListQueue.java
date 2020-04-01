package com.pw.queue;

import com.pw.linkedlist.sll.ListNode;

public class LinkedListQueue {

    private int length;

    private ListNode front, rear;

    public  LinkedListQueue(){

    }

    public void offer(int element){
        ListNode newNode = new ListNode(element);
        if(this.length ==0){
            this.front = newNode;
        }else{
            this.rear.next = newNode;
        }
        this.rear = newNode;
        this.length++;
    }

    public int poll(){
        if(this.length ==0){
            return -1;
        }
        int result = this.front.data;
        this.front = this.front.next;
        this.length--;
        if(this.length ==0)
            this.rear = null;
        return result;
    }

    public int first(){
        return this.front.data;
    }

    public int size(){
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Queue: [");
        ListNode current = this.front;
        while (current!=null){
            result.append(" "+current.data);
            current = current.next;
        }
        result.append("]");
        return result.toString();

    }
}
