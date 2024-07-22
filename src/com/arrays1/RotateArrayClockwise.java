package com.arrays1;

import java.util.Arrays;

/*
Given an array of size N & a no. K rotate the array in a clockwise direction
K times(K<N) without using extra space
A=[1,2,3,4,5] N-K=2 K =3   [

K=1  [5,1,2,3,4]
K=2  [4,5,1,2,3]
K=3  [3,4,5,1,2]

[1,2,3,4,5]


 */
public class RotateArrayClockwise {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int K=2;
        int N=a.length-1;
        System.out.println(Arrays.toString(reverseArrayWithRang(a,0,N-K)));
        System.out.println(Arrays.toString(reverseArrayWithRang(a,N-K+1,N)));
        System.out.println(Arrays.toString(reverseArrayWithRang(a,0,N)));

        System.out.println(Arrays.toString(reverseArrayWithRang(a,0,N-1)));
        System.out.println(Arrays.toString(reverseArrayWithRang(a,0,K-1)));
        System.out.println(Arrays.toString(reverseArrayWithRang(a,K,N-1)));

    }
    public static int[] reverseArrayWithRang (int[] A,int s,int e){
        int i=s;
        int j=e;
        while (i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        return  A;
    }
}
