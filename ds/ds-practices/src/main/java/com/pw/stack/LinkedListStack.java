package com.pw.stack;

import com.pw.linkedlist.sll.ListNode;

public class LinkedListStack {

    private int length;

    private ListNode top;

    public void push(int element){
        ListNode newNode = new ListNode(element);
        if (this.length != 0) {
            newNode.next = this.top;
        }
        this.top = newNode;
        this.length++;
    }

    public int pop(){
        if(this.length ==0){
            return -1;
        }
        int result = top.data;
        this.top = top.next;
        this.length--;
        return result;
    }

    public int top(){
        if(this.length ==0){
            return -1;
        }
        return this.top.data;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Stack: [");
        ListNode current = this.top;
        while (current!=null){
            result.append(" "+current.data);
            current = current.next;
        }
        result.append("]");
        return result.toString();

    }

}
