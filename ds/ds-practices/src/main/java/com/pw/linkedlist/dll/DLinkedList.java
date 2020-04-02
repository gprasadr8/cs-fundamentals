package com.pw.linkedlist.dll;

public class DLinkedList {

    private DLLNode head;

    public DLinkedList(){

    }

    public void insertAtBeginning(DLLNode node){
        if(head!=null){
            node.next = this.head;
            this.head.prev = node;
        }
        this.head = node;
    }

    public void insertAtEnd(DLLNode node){
        if(this.head == null){
            this.head = node;
        }else{
            DLLNode tmp = this.head;
            while (tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = node;
            node.prev = tmp;
        }
    }

    public void insertAtPosition(DLLNode node, int position){
        if(this.head == null && position !=0){
            System.out.println("Invalid position list is empty");
            return;
        }else{
            if(position == 0){
                insertAtBeginning(node);
            }else{
                int count = 0;
                DLLNode tmp = this.head;
                while (tmp!=null){
                    if(count+1 == position){
                        node.prev = tmp;
                        node.next = tmp.next;
                        if(tmp.next!=null){
                            tmp.next.prev = node;
                        }
                        tmp.next = node;
                        break;
                    }
                    count++;
                    tmp = tmp.next;
                }

                if(position>count+1){
                    System.out.println("Invalid position given");
                }
            }

        }
    }

    public String toString(){
        if(this.head == null){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("DList: [");
        DLLNode tmp = this.head;
        while (tmp!=null){
            builder.append(tmp.data);
            tmp = tmp.next;
            if(tmp!=null){
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
