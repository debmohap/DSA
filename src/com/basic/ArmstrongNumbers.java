package com.basic;

/*
Problem Description
You are given an integer A. You need to print all the Armstrong Numbers between 1 to A.
If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
Input Format:
First and only argument is an integer A.
Output Format:
Return an integer array of all the Armstrong numbers in range [1,A].
Example Input:
Input 1:
 5
Input 2:
 200
Example Output:
Output 1:
1
Output 2:
[1, 153]
 */
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int i=153;
        int count=0;
        while (i!=0){
            int A=i%10;
            count+=A*A*A;
            i=i/10;
        }
        System.out.println(count);

    }
}
