package com.pw.linkedlist.sll;

public class SLinkedList {

    private ListNode head;

    private int length;

    public SLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public ListNode getHead() {
        return this.head;
    }

    public int size() {
        return this.length;
    }

    public void insertAtEnd(final ListNode newNode) {
        if (head == null) {
            this.head = newNode;
        } else {
            ListNode tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }

    }

    public String toString() {
        if (this.head == null) {
            return "";
        }
        StringBuilder result = new StringBuilder("[");
        ListNode tmp = head;
        while (tmp != null) {
            result.append(tmp.getData());
            tmp = tmp.getNext();
            if (tmp != null) {
                result.append("->");
            }
        }
        result.append("]");

        return result.toString();

    }
}