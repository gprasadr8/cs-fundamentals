package com.dg.cs.fundamentals.linkedlists.sll;

public class SinglyLinkedList {

    private Node head;
    private int size;
   public SinglyLinkedList(){}
    public void printList(){
        if(head != null){
            Node current_Sll_node = head;
            System.out.print("[");
            while (current_Sll_node !=null){
                System.out.print(" "+ current_Sll_node.value+" ");
                current_Sll_node = current_Sll_node.next;
                System.out.print("->");
            }
            System.out.print(" NULL ]");
        }

    }

    public void insertAtStart(int newValue){
        Node new_Sll_node = new Node(newValue);
        new_Sll_node.next = head;
        this.head = new_Sll_node;
    }

    public void insertAtEnd(int newValue){
        Node new_Sll_node = new Node(newValue);
       if(head == null){
           head = new_Sll_node;
       }else {
         Node curr_Sll_node = head;
          while (curr_Sll_node.next!=null){
              curr_Sll_node = curr_Sll_node.next;
          }
           curr_Sll_node.next = new_Sll_node;
       }
    }

    public void insertAfterTargetNode(Node targetNode, int newValue){
        if(targetNode == null){
            System.err.println("Invalid Target Node");
            return;
        }
        if(this.head !=null){
            Node curr_Sll_node = head;

            while (curr_Sll_node != null && curr_Sll_node.value != targetNode.value ){
                curr_Sll_node = curr_Sll_node.next;
            }
            if(curr_Sll_node == null){
                System.err.println("Target node not found in the list");
                return;
            }
            Node new_Sll_node = new Node(newValue);
            new_Sll_node.next = curr_Sll_node.next;
            curr_Sll_node.next = new_Sll_node;

        }
    }

    public void insertBeforeTargetNode(Node head, Node targetNode, int newValue){
        //TODO: Yet to implement
   }

   public void deleteAtFirst(){
       //TODO: Yet to implement
   }

   public  void deleteAtEnd(){
       //TODO: Yet to implement
   }

    static class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

}
