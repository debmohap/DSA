package com.carryForward;
/*
Problem Description
You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.`1
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
Example Input
Input 1:
A = "ABCGAG"
Input 2:
A = "GAB"
Example Output
Output 1:3
Output 2: 0
 */
public class SpecialSubsequencesAG {
    public static void main(String[] args) {
        System.out.println(specialSubsequences("ABCGAG"));
    }


    public static int specialSubsequences(String A) {
        char[] ch=A.toCharArray();
        int count=0;
        int ans=0;
        for (char a:ch){
            if(a=='A'){
                count++;
            } else if (a=='G') {
                ans+=count;
            }
        }
        return ans;
    }
}
