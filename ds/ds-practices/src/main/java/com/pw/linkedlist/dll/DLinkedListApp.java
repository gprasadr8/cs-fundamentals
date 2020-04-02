package com.pw.linkedlist.dll;

public class DLinkedListApp {

    public static void main(String[] args) {
        DLinkedList dlist = new DLinkedList();
        DLLNode element1 = new DLLNode(10);
        DLLNode element2 = new DLLNode(20);
        DLLNode element3 = new DLLNode(30);
        dlist.insertAtBeginning(element1);
        dlist.insertAtEnd(element2);
        dlist.insertAtPosition(element3, 1);
        System.out.println(dlist);
        dlist.insertAtPosition(new DLLNode(50), 0);
        System.out.println("Inserting 50 at position 0");
        System.out.println(dlist);
        System.out.println("Inserting 60 at position 4");
        dlist.insertAtPosition(new DLLNode(60), 4);
        System.out.println(dlist);

        System.out.println("Inserting 100 at position 10");
        dlist.insertAtPosition(new DLLNode(100), 10);
        System.out.println(dlist);
    }
}
