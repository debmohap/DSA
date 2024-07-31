package com.slidingWindow;
/*
Given an array & no. K find the sum of all the sub-array of length K
Explanation : Find the sum of all the subarray with given k length meaning you have to find
all the subarray with length K then
 */
public class A_StartHere {


    public static void main(String[] args) {
        // Brute Force:

        int[] A={-3,4,-2,5,3,-2,8,2,-1,4};
        int K=5;
        int s=1;
        int e=K;
        int sum = 0;
        for (int i = 0; i <K; i++) {
            sum =sum+ A[i];
        }
        System.out.println(sum);
        while (e<A.length) {
            sum=sum-A[s-1]+A[e];
            System.out.println(sum);
            s++;
            e++;
        }
    }

}
