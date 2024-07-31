package com.slidingWindow;

/*
Given an array and a no. B you have to find minimum no swap

Given an array of integers A and an integer B, find and return the minimum number of swaps required
to bring all the numbers less than or equal to B together.
Note: It is possible to swap any two elements, not necessarily consecutive.
Input Format:
The first argument given is the integer array A.
The second argument given is the integer B.
Output Format:
Return the minimum number of swaps.
Input 1:
 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
 Output 1:
 2
 */
public class MinNoOfSwap {
    public static void main(String[] args) {
        int[] A = {1, 12, 10, 13, 5, 13, 23, 3};
        int B = 8;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        int swap = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] > B) {
                swap++;
            }
        }
        int minSwaps = swap;
        int s = 0;
        int e = count;
        while (e < A.length) {
            if (A[s] > B) {
                swap--;
            }
            if (A[e] > B) {
                swap++;
            }
            minSwaps = Math.min(minSwaps, swap);
            s++;
            e++;
        }
        System.out.println(swap);
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int cnt = 0;
        // count number of elements <= B
        for (int x : A)
            if (x <= B)
                cnt++;
        // If there is only one element, No need to swap
        if (cnt <= 1)
            return 0;
        else {
            int l = 0, r = 0, x = 0;
            // Find the count of elements <= B in every window of length cnt using two
            //pointer approach
            while (r < cnt) {
                if (A[r] > B)
                    x++;
                r++;
            }
            int ans = x;
            while (r < n) {
                if (A[r] > B)
                    x++;
                if (A[l] > B)
                    x--;
                ans = Math.min(ans, x);
                r++;
                l++;
            }
            return ans;
        }
    }
}
