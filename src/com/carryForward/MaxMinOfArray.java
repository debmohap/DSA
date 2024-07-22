package com.carryForward;
/*
Given an array return the length of smallest sub array which contains the both
max and min of the array


 */

public class MaxMinOfArray {
    public static void main(String[] args) {
        //BrutForce
        int[] A={1,2,3,1,3,4,6,4,6,3};
        int max=A[0];
        int min=A[0];
        int maxI=-1;
        int minI=-1;
        int ans=A.length;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max){
                max=A[i];
            } else if (A[i]<min) {
                min=A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j <A.length ; j++) {
                if(A[j]==max){
                    maxI=j;
                }  else if (A[j]==min) {
                    minI=j;
                }


            }
        }
        System.out.println(maxI);
        System.out.println(minI);
        System.out.println(ans);
    }
    public static void maxMinArray(){

    }
}
