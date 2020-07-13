package com.pw.arrays.problems;

public class JumpsOnCloud {

    public static void main(String[] args) {
     int[] clouds = new int[]{0,0,1,0,0,1,0};
     jumpingOnClouds(clouds);
    }

    static int jumpingOnClouds(int[] c) {
        int jumps =0;
        int i=0;
        while(i<c.length-1){
            if(i<c.length-2&& c[i+2]!=1){
                jumps++;
                i=i+2;
            }else{
                i++;
                jumps++;
            }
        }
        return jumps;

    }
}
