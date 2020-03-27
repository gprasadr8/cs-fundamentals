package com.pw.queue;

public class SimpleArrayQueue {

    private int[] queueAry;

    private int capacity;

    private static final int DEFAULT_CAPACITY = 10;

    private int front;

    private int rear;

    private int length;

    public SimpleArrayQueue(){
        this.capacity = DEFAULT_CAPACITY;
        this.queueAry = new int[this.capacity];
        this.front = this.rear = -1;
        this.length = 0;
    }

    public SimpleArrayQueue(int capacity){
        this.capacity = capacity;
        this.queueAry = new int[this.capacity];
        this.front = this.rear = -1;
        this.length = 0;
    }

    public boolean isEmpty(){
        return this.length ==0;
    }

    public int size(){
        return  this.length;
    }

    public void enQueue(int data) throws Exception {
        if(this.rear == this.capacity-1){
            throw  new Exception("Full Queue Exception");
        }
        if(this.front == -1 && this.rear ==-1){
            this.front = this.rear = this.rear+1;
        }else {
            this.rear +=1;
        }
        this.queueAry[this.rear] = data;
        this.length++;
    }

    public int deQueue() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Empty Queue Exceptions");
        }
        if(this.front == this.rear){
            int result = this.queueAry[this.front];
            this.front = this.rear = -1;
            this.length = 0;
            return result;
        }
        int result = this.queueAry[this.front];
        this.queueAry[this.front] = 0;
        this.length--;
        this.front++;
        return result;
    }

    public String toString(){
        if(this.length==0){
            return "[]";
        }
        StringBuilder result = new StringBuilder("Queue:[");
        for(int i=this.front;i<=rear;i++){
            result.append(this.queueAry[i]);
            if(i<rear){
                result.append("<-");
            }
        }
        result.append("]");
        return result.toString();
    }
}