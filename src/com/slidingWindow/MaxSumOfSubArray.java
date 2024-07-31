package com.slidingWindow;

public class MaxSumOfSubArray {
    public static void main(String[] args) {

        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        int K = 5;
        int s = 1;
        int e = K;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum = sum + A[i];
        }
        int maxSum=sum;
        while (e<A.length){
            sum=sum-A[s-1]+A[e];
            if (maxSum<sum)
                maxSum=sum;
            s++;
            e++;
        }
        System.out.println(maxSum);
    }

}
