package com.carryForward;

/*
Problem Description:You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
(i<j)
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
Example Input:
Input 1:
 A = "ABCGAG"
Input 2:
 A = "GAB"
 Output 1: 3
Output 2: 0
Example Explanation:
Explanation 1:Subsequence "AG" is 3 times in given string
Explanation 2:There is no subsequence "AG" in the given string.
 */
public class SpecialSubsequences {
    public static void main(String[] args) {
        String A = "ACBAGKAGG";
        System.out.println(subsequencesAG(A.toCharArray()));

    }
    public static int subsequencesAG(char[] A){
        int countA=0;
        int ans=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]=='A')
                countA++;
            else if (A[i]=='G')
                ans+=countA;
        }
        return ans;
    }

}
