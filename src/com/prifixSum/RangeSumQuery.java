package com.prifixSum;

import java.util.Arrays;

/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2,
where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices
in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Example Input:
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]] PS[R]-PS[L-1]
Example Output:
Output 1:
[10, 5]
Output 2:

[2, 4]
 */
public class RangeSumQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};
        System.out.println(Arrays.toString(rangeSum(A, B)));
    }

    public static int[] rangeSum(int[] A, int[][] B) {
        int[] PS = new int[A.length];
        int[] sum = new int[B.length];
        PS[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            PS[i] = PS[i - 1] + A[i];
        }
        System.out.println(Arrays.toString(PS));
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            if (L >= 1)
                sum[i] = PS[R] - PS[L - 1];
            else
                sum[i]= PS[R];
        }
        return sum;
    }

}
