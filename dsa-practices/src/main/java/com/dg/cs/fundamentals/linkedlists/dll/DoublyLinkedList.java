package com.dg.cs.fundamentals.linkedlists.dll;

public class DoublyLinkedList {
    private DllNode head;
    private int size;
    public DoublyLinkedList(){
    }

    public void insertAtStart(int value){
        DllNode new_node = new DllNode(null,value,head);
        head.prev = new_node;
        head = new_node;
    }

    public void insertAtEnd(int value){
       if(head == null){
           head = new DllNode(null,value,null);
           return;
       }
       DllNode curr_node = head;
       while (curr_node.next != null){
           curr_node = curr_node.next;
       }
       curr_node.next = new DllNode(curr_node,value,null);
    }

    public void insertAfterTargetNode(DllNode target_node, int value){
        if(head == null || target_node == null){
            return;
        }
        DllNode curr_node = head;
        while(curr_node != null && curr_node.value != target_node.value){
            curr_node = curr_node.next;
        }
        if(curr_node == null){
            System.err.println("Target Node not found in the list");
        }else{
            DllNode next_node = curr_node.next;
            DllNode new_node = new DllNode(curr_node, value,curr_node.next);
            curr_node.next = new_node;
            next_node.prev = new_node;
        }
    }

    public void insertBeforeTargetNode(DllNode target_node, int value){
        if(head == null || target_node == null){
            System.err.println("List is empty or Target Node is null.");
            return;
        }
        DllNode curr_node = head;
        while (curr_node != null && curr_node.value != target_node.value){
            curr_node = curr_node.next;
        }
        if(curr_node == null){
            System.err.println("Target Node not found in the list.");
        }else {
            DllNode prev_node = curr_node.prev;
            DllNode new_node = new DllNode(curr_node.prev, value,curr_node);
            prev_node.next = new_node;
            curr_node.prev = new_node;
        }
    }

    public void deleteAtStart(){
        //TODO: yet to implement
    }

    public void deleteAtEnd(){
        //TODO: yet to implement
    }

    public void deleteAfterTargetNode(DllNode target_node){
            //TODO: yet to implement
    }

    public void deleteBeforeTargetNode(DllNode target_node){
        //TODO: yet to implement
    }
    public void printList(){
        if(head == null){
            System.out.println("[]");
            return;
        }
        DllNode curr_node = head;
        System.out.print("[ NULL");
        while (curr_node!=null){
            System.out.print(" --> "+curr_node.value);
            curr_node = curr_node.next;
        }
        System.out.print(" --> NULL ]");
    }

    public void printListInReverseOrder(){
        if(head == null){
            System.out.println("[]");
            return;
        }
        DllNode curr_node = head;

        while (curr_node.next!=null){
            curr_node = curr_node.next;
        }
        System.out.print("[ NULL");
        while (curr_node!=null){
            System.out.print(" <-- "+curr_node.value);
            curr_node = curr_node.prev;
        }
        System.out.print(" <-- NULL ]");
    }
    static class DllNode {
        int value;
        DllNode next;
        DllNode prev;
        DllNode(int value){
            this.value = value;
        }
        DllNode(DllNode prev, int value, DllNode next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

}
