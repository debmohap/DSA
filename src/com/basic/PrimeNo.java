package com.basic;

/*
Problem Description
Given a number A. Return 1 if A is prime and return 0 if not.

Note :
The value of A can cross the range of Integer.
 */
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static int isPrime(int A) {
        int count = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) count++;
                else count += 2;
            }
        }
        if(count==2)
            return 1;
        else
            return 0;
    }

}
