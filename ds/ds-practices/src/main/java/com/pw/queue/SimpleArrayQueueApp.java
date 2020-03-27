package com.pw.queue;

public class SimpleArrayQueueApp {

    public static void main(String[] args) throws Exception {
        SimpleArrayQueue queue = new SimpleArrayQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("After 5 enqueues queue: "+queue);
        //queue.enQueue(60); //full stack exception
        System.out.println("queue: "+queue);
        System.out.println("Deque-1: "+queue.deQueue());
        System.out.println("Deque-2: "+queue.deQueue());
        System.out.println("Deque-3: "+queue.deQueue());
        System.out.println("-------------- After 3 dequeues ------------------");
        System.out.println("queue: "+queue);
        System.out.println("size: "+queue.size());
        //System.out.println("-----------enqueue after 3 dequeues ------------ ");
        //queue.enQueue(60); //it fails because rear already reached the capacity
        System.out.println("Deque-4: "+queue.deQueue());
        System.out.println("Deque-5: "+queue.deQueue());
        System.out.println("After 5 dequeues queue:"+queue);
        System.out.println("Deque-6: "+queue.deQueue());
    }
}
