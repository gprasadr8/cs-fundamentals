package com.dg.cs.fundamentals.arrays.lt.problems;

import java.util.Arrays;

public class ArrayProblems1 {

    public static void main(String[] args) {
        ArrayProblems1 arrayProblems1 = new ArrayProblems1();
        int[] nums = {123,345, 2,62, 7896 };
        int evenNumOfDigits = arrayProblems1.evenNumOfDigits(nums);
        System.out.println("Array: "+ Arrays.toString(nums));
        System.out.println("Even Num of Digits: "+evenNumOfDigits);

    }

    private int evenNumOfDigits(int[] nums) {
        int evenNumOfDigitsInArrayCount = 0;
        for(int num: nums){
            int digitCount = 0;
            while (num>0){
                num = num/10;
                digitCount++;
            }
            if(digitCount%2 == 0){
                evenNumOfDigitsInArrayCount++;
            }
        }
        return evenNumOfDigitsInArrayCount;
    }

}
