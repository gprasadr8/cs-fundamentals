package com.dg.cs.fundamentals.linkedlists.dll;

public class DoublyLinkedListApp {

    public static void main(String[] args) {
        DoublyLinkedList linkedList =  new DoublyLinkedList();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);

        linkedList.insertAtStart(30);

        linkedList.insertAfterTargetNode(new DoublyLinkedList.DllNode(10), 40);
        linkedList.insertBeforeTargetNode(new DoublyLinkedList.DllNode(20), 50);
        printList(linkedList);
    }

    private static void printList(DoublyLinkedList linkedList) {
        System.out.println("List printing from head to tail");
        linkedList.printList();
        System.out.println("\n List printing from tail to head");
        linkedList.printListInReverseOrder();
    }
}
