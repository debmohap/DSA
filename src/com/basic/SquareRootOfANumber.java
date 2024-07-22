package com.basic;
/*
Problem Description
Given a number A. Return square root of the number if it is perfect square otherwise
return -1.
Note: A number is a perfect square if its square root is an integer.
 */
public class SquareRootOfANumber {
    public static void main(String[] args) {

    }
    public static int isSquare(int A){
        int count =0;
        for (int i = 1; i*i <=A ; i++) {
            if(i*i==A){
                count=i;
               break;
            }
        }
        if (count==0){
            return -1;
        }else
            return count;
    }
}
