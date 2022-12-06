package com.dg.cs.fundamentals.linkedlists.sll;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtEnd(10);
        sll.insertAtEnd(20);
        sll.insertAtStart( 30);
        sll.insertAfterTargetNode(new SinglyLinkedList.Node(10), 40);
        sll.insertAfterTargetNode(new SinglyLinkedList.Node(1000), 40);
        sll.printList();
    }

}
