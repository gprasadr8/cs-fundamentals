package com.pw.stack;

public class LinkedListStackApp {

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println("Pop-1:  "+stack.pop());
        System.out.println("Pop-2:  "+stack.pop());
        System.out.println("-----------After 2 pops---------");
        System.out.println(stack);
        System.out.println("Top: "+stack.top());
    }
}
