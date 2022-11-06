package com.dg.cs.fundamentals.arrays;

import java.util.Arrays;

public class ArrayInsertionOperations {

    public static void main(String[] args) {
        ArrayInsertionOperations arrayOps = new ArrayInsertionOperations();
        int[] squares = arrayOps.createSquaresArray();
        System.out.println("==============  Insert Element at End    ================");
        System.out.println("Before insert: "+ Arrays.toString(squares));
        arrayOps.insertElementAtEnd(arrayOps.createSquaresArray());
        arrayOps.insertElementAtEnd_WithLengthFlag(arrayOps.createSquaresArray(), 5);
        System.out.println("===========================================================");

        System.out.println("==============  Insert Element at Start    ================");
        System.out.println("Before insert: "+ Arrays.toString(squares));
        arrayOps.insertElementAtStart(arrayOps.createSquaresArray());
        arrayOps.insertElementAtStart_WithLengthFlag(arrayOps.createSquaresArray(), 5);
        System.out.println("===========================================================");

        System.out.println("==============  Insert Element at any index    ================");
        System.out.println("Before insert: "+ Arrays.toString(squares));
        arrayOps.insertElementAtGivenIndex(arrayOps.createSquaresArray(), 3);
        arrayOps.insertElementAtGivenIndex_WithLengthFlag(arrayOps.createSquaresArray(), 5,3);
        System.out.println("===========================================================");
    }

    private void insertElementAtGivenIndex_WithLengthFlag(int[] squares, int length, int insertIndex) {
        if(insertIndex <0 || insertIndex > squares.length){
            System.err.println("Given index is out of array length.");
            return;
        }
        int numOfShifts = 0;
        if(insertIndex == length){
            squares[insertIndex] = 36;
        }else if(insertIndex < length){
            for(int i = length; i>insertIndex; i--){
                squares[i] = squares[i-1];
                numOfShifts++;
            }
            squares[insertIndex] = 36;
        }else {
            squares[insertIndex] = 36;
            length+= (insertIndex-length);
        }
        System.out.println("After insert with length flag: "+ Arrays.toString(squares));
        System.out.println("Number of elements shifted: "+numOfShifts);
    }

    private void insertElementAtGivenIndex(int[] squares, int insertIndex) {
        if(insertIndex <0 || insertIndex > squares.length){
            System.err.println("Given index is out of array length.");
            return;
        }
        int numOfShifts = 0;
        for(int i = squares.length-1; i>insertIndex; i--){
            squares[i] = squares[i-1];
            numOfShifts++;
        }
        squares[insertIndex] = 36;
        System.out.println("After insert at index "+insertIndex+":"+ Arrays.toString(squares));
        System.out.println("Number of elements shifted: "+numOfShifts);

    }

    private void insertElementAtStart_WithLengthFlag(int[] squares, int length) {
        int current_index = length;
        int numOfShifts = 0;
        for(int i = current_index;i>0;i--){
            squares[current_index] = squares[current_index-1];
            current_index--;
            numOfShifts++;
        }
        squares[current_index] = 36;
        length++;
        System.out.println("After insert with length flag: "+ Arrays.toString(squares));
        System.out.println("Number of elements shifted: "+numOfShifts);
    }

    private void insertElementAtStart(int[] squares) {
        int numOfShifts = 0;
        for(int i=squares.length-1; i>0; i--){
            squares[i] = squares[i-1];
            numOfShifts++;
        }
        squares[0] = 36;
        System.out.println("After insert: "+ Arrays.toString(squares));
        System.out.println("Number of elements shifted: "+numOfShifts);

    }

    private void insertElementAtEnd(int[] squares) {
        squares[squares.length-1] = 36;
        System.out.println("After insert: "+ Arrays.toString(squares));
    }

    private int[] createSquaresArray() {
        int[] squares  = new int[10];
        for(int i=0;i<5;i++){
            squares[i] = (i+1)*(i+1);
        }
        return squares;
    }

    public void insertElementAtEnd_WithLengthFlag(int[] squares, int length){
        squares[length++] = 36;
        System.out.println("After insert with length flag: "+ Arrays.toString(squares));
    }
}
