package com.pw.linkedlist.sll;



public  class  LinkedListApp{
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        ListNode newNode1 = new ListNode(10);
        list.insertAtEnd(newNode1);

        ListNode newNode2 = new ListNode(20);
        list.insertAtEnd(newNode2);

        System.out.println("List = "+list);
    }
}