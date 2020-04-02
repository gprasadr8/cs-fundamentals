package com.pw.linkedlist.cll;

public class CLinkedListApp {

    public static void main(String[] args) {
        CLinkedList clist = new CLinkedList();
        clist.insertAtBeginning(new CLLNode(10));
        clist.insertAtBeginning(new CLLNode(20));
        clist.insertAtEnd(new CLLNode(30));
        System.out.println(clist);
        System.out.println("Inserting 50 at start");
        clist.insertAtBeginning(new CLLNode(50));
        System.out.println(clist);
        System.out.println("Deleting at start ");
        clist.deleteAtStart();
        System.out.println(clist);
        System.out.println("Deleting at end ");
        clist.deleteAtEnd();
        System.out.println(clist);
    }
}
