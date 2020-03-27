package com.pw.stack;

public class FixedSizeArrayStackApp {

    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack arrayStack = new FixedSizeArrayStack(4);
        //arrayStack.pop(); //stack underflow
        System.out.println("isEmpty(): " + arrayStack.isEmpty() + " and size: " + arrayStack.size());
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);
        //arrayStack.push(50);// stack overflow
        System.out.println(arrayStack);
        System.out.println("isEmpty(): " + arrayStack.isEmpty() + " and size: " + arrayStack.size());

        //pop
        arrayStack.pop();
        System.out.println("After pop:\n " + arrayStack);
        System.out.println("top element: " + arrayStack.top());
        System.out.println("After top:\n " + arrayStack);

    }
}
