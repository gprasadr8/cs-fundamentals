package com.pw.queue;

public class LinkedListQueueApp {

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);
        System.out.println("Poll-1:  "+queue.poll());
        System.out.println("Poll-2:  "+queue.poll());
        System.out.println(queue);
        System.out.println("First: "+queue.first());
    }
}
