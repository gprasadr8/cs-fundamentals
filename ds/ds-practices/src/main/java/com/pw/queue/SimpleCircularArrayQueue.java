package com.pw.queue;

public class SimpleCircularArrayQueue {

    private int[] queueAry;

    private int capacity;

    private  static final  int DEFAULT_CAPACITY = 10;

    private int front;

    private  int rear;

    private  int length;

    public SimpleCircularArrayQueue(){
        this.capacity = DEFAULT_CAPACITY;
        this.queueAry = new int[this.capacity];
        this.front = this.rear = -1;
        this.length = 0;
    }

    public SimpleCircularArrayQueue(int capacity){
        this.capacity = capacity;
        this.queueAry = new int[this.capacity];
        this.front = this.rear = -1;
        this.length = 0;
    }

    public int size(){
        return  this.length;
    }

    public void enQueue(int data) throws Exception {
        if(this.length == queueAry.length){
            throw new Exception(" Full Queue Exception");
        }
        // for first insertion
        if(this.front ==-1 && this.rear ==-1){
            this.front = this.rear = 0;
        }else{
            this.rear = (this.rear+1)%queueAry.length;
        }
        queueAry[this.rear] = data;
        this.length++;
    }

    public int deQueue() throws Exception {
        if(this.length == 0){
            throw  new Exception("Empty Queue Exception");
        }
        int result = queueAry[this.front];
        // if queue has only one element
        if(this.front == this.rear){
            this.front = this.rear = -1;
            this.length =0;
        }else{
            this.front = (this.front+1)%queueAry.length;
            this.length--;
        }
        return result;
    }

    public String toString(){
        if(this.length ==0){
            return "[]";
        }
        StringBuilder result = new StringBuilder("Queue: [");
        int start = this.front;
        while(start != this.rear){
            result.append(queueAry[start]+"<-");
            start = (start+1)%queueAry.length;
        }
        result.append(queueAry[this.rear]);

        result.append("]");
        return result.toString();
    }
}
