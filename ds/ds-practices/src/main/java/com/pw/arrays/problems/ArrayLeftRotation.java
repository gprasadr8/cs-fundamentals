package com.pw.arrays.problems;

import javafx.beans.binding.When;

import java.util.Arrays;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        ArrayLeftRotation arrayRotation = new ArrayLeftRotation();
        System.out.println("-----------------Left Rotation One By One----------------");
        System.out.println(Arrays.toString(arrayRotation.rotateLeftOneByOne(new int[]{1,2,3,4,5}, 3)));;
        System.out.println("-----------------Left Rotation Using Temp[]----------------");
        System.out.println(Arrays.toString(arrayRotation.rotLeft(new int[]{1,2,3,4,5}, 3)));;

    }

    //When we perform d=4  left rotations, the array undergoes the following sequence of changes:
    // [1,2,3,4,5] -> [2,3,4,5,1] ->[3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]

    public int[] rotLeft(int[] a, int d) {

        int[] tmp = new int[d];
        for(int i=0;i<d;i++){
            tmp[i] = a[i];
        }
        int startIndex =0;
        for(int i=d;i<a.length;i++){
            a[startIndex] = a[i];
            startIndex++;
        }
        for(int i=0; i<tmp.length;i++){
            a[startIndex] = tmp[i];
            startIndex++;
        }

        return a;

    }

    public int[] rotateLeftOneByOne(int[] a, int d){
        for(int i=0;i<d;i++){
            int tmp = a[0];
            for(int j=0;j<a.length-1;j++){
                a[j] = a[j+1];
            }
            a[a.length-1] = tmp;
        }
        return a;
    }
}
