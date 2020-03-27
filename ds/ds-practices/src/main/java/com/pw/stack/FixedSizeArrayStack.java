package com.pw.stack;

import java.util.Arrays;

public class FixedSizeArrayStack {

    private int capacity;

    private int DEFAULT_CAPACITY = 10;

    private int top = -1;

    private int[] stackAry;

    public FixedSizeArrayStack() {
        this.stackAry = new int[DEFAULT_CAPACITY];
        this.capacity = this.DEFAULT_CAPACITY;
    }

    public FixedSizeArrayStack(final int capacity) {
        this.capacity = capacity;
        this.stackAry = new int[capacity];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(final int data) throws Exception {
        if (size() == this.capacity) {
            throw new Exception("stack overflow");
        }
        this.stackAry[++top] = data;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack underflow");
        }
        int lastElement = this.stackAry[top];
        this.stackAry[top] = Integer.MIN_VALUE;
        top--;
        return lastElement;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack underflow");
        }
        return this.stackAry[top];
    }

    @Override
    public String toString() {
        return "FixedSizeArrayStack{" +
                "stackAry=" + Arrays.toString(stackAry) +
                '}';
    }
}
