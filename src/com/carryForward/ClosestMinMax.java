package com.carryForward;

/*
Problem Description:
Given an array A, find the size of the smallest subarray such that it contains at least
one occurrence of the maximum value of the array and at least one occurrence of the
minimum value of the array.
input Format: First and only argument is vector A
Output Format:
Return the length of the smallest subarray which has at least one occurrence of minimum
and maximum element of the array
Input Format:
First and only argument is vector A
Output Format:
Return the length of the smallest subarray which has at least one occurrence of minimum
and maximum element of the array
Example Input:
Input 1:A = [1, 3, 2]
Input 2:A = [2, 6, 1, 6, 9]
Example Output:
Output 1: 2
Output 2: 3
 */
public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        int[] B = {1, 2, 3, 1, 2, 4, 6, 4, 6, 3};
        System.out.println(solve(B));
    }

    public static int solve(int[] A) {
        int max = A[0];
        int small = A[0];
        int n = A.length - 1;
        for (int i = 0; i <= n; i++) {
            if (max > A[i]) {
                max = A[i];
            }
            if (small < A[i]) {
                small = A[i];
            }
        }
        int aMax = -1;
        int aMin = -1;
        int ountput = n + 1;
        for (int i = 0; i <= n; i++) {
            if (A[i] == max) {
                aMax = i;
                if (aMin >= 0) {
                    ountput = min(aMax - aMin + 1, ountput);
                }
            }
            if (A[i] == small) {
                aMin = i;
                if (aMax >= 0) {
                    ountput = min(aMin - aMax + 1, ountput);
                }
            }
        }
        return ountput;
    }

    public static int min(int diff, int out) {
        if (diff < out)
            return diff;
        return out;
    }
}
