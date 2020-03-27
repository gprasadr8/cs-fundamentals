package com.pw.queue;

public class SimpleCircularArrayQueueApp {
    public static void main(String[] args) throws Exception {
        SimpleCircularArrayQueue queue = new SimpleCircularArrayQueue(5);
        //queue.deQueue();//should throw Empty Queue Exception;
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("------After 5 enqueues ------------");
        System.out.println(queue);
        System.out.println("size: "+queue.size());
       // queue.enQueue(60); //Full Queue Exception
        System.out.println("1-deq:"+queue.deQueue());
        System.out.println("2-deq:"+queue.deQueue());
        System.out.println("------------After 2 deqs-----------");
        System.out.println(queue);
        System.out.println("size: "+queue.size());
        System.out.println("------2 more enqs ------------------");
        queue.enQueue(60);
        queue.enQueue(70);
        System.out.println("-----------After 2 enqs--------------");
        System.out.println(queue);
        System.out.println("size: "+queue.size());

        // deleting all elements
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("--------After 5 deqs ---------- ");
        System.out.println(queue);
        System.out.println("size: "+queue.size());

    }
}
