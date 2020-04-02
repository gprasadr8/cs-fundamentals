package com.pw.linkedlist.cll;

public class CLinkedList {

    private CLLNode head;

    public void insertAtBeginning(CLLNode node){
        if(this.head == null){
            this.head = node;
            this.head.next = this.head;
        }else{
            node.next = this.head;
            CLLNode tmp = this.head;
            while (tmp.next!= this.head){
                tmp = tmp.next;
            }
            tmp.next = node;
            this.head = node;
        }
    }

    public void insertAtEnd(CLLNode node){
        if(this.head == null){
            this.head = node;
            this.head.next = this.head;
        }else{
            CLLNode tmp = this.head;
            while (tmp.next != this.head){
                tmp = tmp.next;
            }
            tmp.next = node;
            node.next = this.head;
        }
    }

    public void deleteAtStart(){
        if(this.head == null){
            System.out.println("Circular Linked List is empty");
        }else{
            if(this.head.next == this.head){
                this.head = null;
            }else{
                CLLNode tmp = this.head;
                while (tmp.next!= this.head){
                    tmp = tmp.next;
                }
                tmp.next = this.head.next;
                this.head = this.head.next;
            }
        }
    }
    
    public void deleteAtEnd(){
        if(this.head == null){
            System.out.println("Circular Linked List is empty");
        }else{
            if(this.head.next == this.head){
                this.head = null;
            }else{
                CLLNode tmp = this.head;
                CLLNode prev = null;
                while (tmp.next!= this.head){
                    prev = tmp;
                    tmp = tmp.next;
                    
                }

                prev.next = this.head;
                tmp.next = null;
            }
        } 
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("CList: [");
        CLLNode tmp = this.head;
        while (tmp!=null && tmp.next!=this.head){
            builder.append(tmp.data);
            tmp = tmp.next;
            builder.append(", ");
        }
        builder.append(tmp.data);
        builder.append("]");
        return builder.toString();

    }
}
