package com.basic;
/*
Problem Description
You are given an integer A, you need to find and return the sum of all the even
numbers between 1 and A.
Even numbers are those numbers that are divisible by 2.
Input Format
First and only argument is an integer A.
Output Format
Return an integer denoting the sum of even numbers between [1, A] (both inclusive).
 */
public class SumOfEvens {
    public static void main(String[] args) {
        System.out.println(sumEvenNo(5));
    }
    public static int sumEvenNo(int N){
        int count =0;
        for (int i = 1; i <N ; i++) {
            if(i%2==0){
                count+=i;
            }
        }
        return count;
    }
}

