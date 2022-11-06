package com.dg.cs.fundamentals.arrays;

import java.util.Arrays;

public class ArraysDefinition {

    public static void main(String[] args) {
        // dataType [] nameOfArray = new dataType [size]
        // for (dataType variable : nameOfArray) {
        //    // Code to execute
        //}
        String[] names = new String[]{"Ram","Sam","John"};
        int ages[] = {};
        int ages2[] = new int[0];
        double[] gpas = {4.5, 6.7,8.0,9};

        System.out.println("names: "+ Arrays.toString(names));
        System.out.println("Ages: "+Arrays.toString(ages));
        System.out.println("Ages: "+Arrays.toString(ages2));
        System.out.println("GPAs: "+Arrays.toString(gpas));
        int[] squares = writeSquares();
        printSquares(squares);
        printSquaresByForEach(squares);

    }

    private static void printSquaresByForEach(int[] squares) {
        for(int square: squares){
            System.out.print(square+" ");
        }
        System.out.println();
    }

    private static void printSquares(int[] squares) {
        for(int i=0;i<squares.length;i++ ){
            System.out.print(squares[i]+" ");
        }
        System.out.println();
    }

    private static int[] writeSquares() {
        int[] squares = new int[10];
        for(int i=0; i< squares.length;i++){
            squares[i] = (i+1)*(i+1);
        }
        return squares;
    }
}
