package com.dg.cs.fundamentals.arrays;

import java.util.Arrays;

public class DynamicArray {

    private int capacity;

    private static final int DEFAULT_CAPACITY = 10;

    private int[] data;

    private int size;

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.data = new int[this.capacity];
        this.size = 0;
    }

    public DynamicArray(){
        this.capacity = this.DEFAULT_CAPACITY;
        this.data = new int[this.capacity];
        this.size = 0;
    }

    public void add(int element){
        ensureCapacity(this.size+1);
        this.data[size++] = element;
    }

    public void add(int index, int element){
        ensureCapacity(this.size+1);
        System.arraycopy(this.data, index, this.data, index+1, size);
        this.data[index] = element;
        this.size++;
    }

    public boolean remove(int element) {
        for (int index = 0; index < size; index++){
            if (this.data[index] == element) {
                int numMoved = size - index - 1;
                if (numMoved > 0)
                    System.arraycopy(data, index+1, data, index, numMoved);
                data[--size] = 0;
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity(int minCapacity) {
        if(minCapacity>=this.capacity){
            int newCapacity = this.capacity*2;
            int[] tmp = new int[newCapacity];
            System.arraycopy(this.data, 0, tmp, 0, this.capacity);
            this.data = tmp;
            this.capacity = newCapacity;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }
}
