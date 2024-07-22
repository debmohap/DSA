package com.prifixSum;

import java.util.Arrays;

/*
Given an array of size N Q queries of the format s & e (s<=e)
Return the sum of the element from the index s to e

A= [-3, 6, 2, 4, 5, 2, 8 ,-9, 3, 1]
Q=4
s= 1  e = 3 ===> 12  8-(-3) =12
s= 2  e = 7 ===> 12
 */
public class SumGivenRang {
    public static void main(String[] args) {
        int[] A= {-3, 6, 2, 4, 5, 2, 8 ,-9, 3, 1};
        System.out.println(returnSum(A,2,7));
    }
    public static int returnSum(int[] A,int s, int e){
        int sum=0;
        int length = A.length;
        int[] prefixSum=new int[length];
        prefixSum[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            prefixSum[i]=prefixSum[i-1]+A[i];
        }//[-3, 3, 8, 6, 9, 7, 10, -1, -6, 4]
        System.out.println(Arrays.toString(prefixSum));
        return prefixSum[e]-prefixSum[s-1];

    }
}
