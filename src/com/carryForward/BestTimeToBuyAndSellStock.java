package com.carryForward;

/*
Problem Description
Say you have an array, A, for which the ith element is the price of a given stock
on day i.If you were only permitted to complete at most one transaction
(ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit.Return the maximum possible profit.

Input Format:The first and the only argument is an array of integers, A.
Output Format: Return an integer, representing the maximum possible profit.
Example Input:
Input 1:A = [1, 2]
Input 2: A = [1, 4, 5, 2, 4]
Example Output:
Output 1: 1
Output 2: 4
Example Explanation:
Explanation 1:
Buy the stock on day 0, and sell it on day 1.
Explanation 2:
Buy the stock on day 0, and sell it on day 2.
 */
public class BestTimeToBuyAndSellStock {


    public static void main(String[] args) {

    }

    public int maxProfit(final int[] A) {
        int[] arr = new int[A.length];
        int maxProfit = 0;
        int min = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > min) {
                min = A[i];
                arr[i] = min;
            } else arr[i] = min;

        }
        for (int i = 0; i <= A.length - 1; i++) {
            int profit = arr[i] - A[i];
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;


    }
}
