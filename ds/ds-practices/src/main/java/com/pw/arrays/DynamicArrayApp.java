package com.pw.arrays;

public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        System.out.println(array);
        System.out.println("size: "+array.size());

        array.remove(20);
        System.out.println(array);
        System.out.println("size: "+array.size());
    }
}
