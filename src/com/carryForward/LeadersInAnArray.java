package com.carryForward;

import java.util.ArrayList;

/*
Problem Description
Given an integer array A containing N distinct integers, you have to find all
the leaders in array A. An element is a leader if it is strictly greater than
all the elements to its right side.
NOTE: The rightmost element is always a leader.
Input Format:
There is a single input argument which a integer array A
Output Format:
Return an integer array denoting all the leader elements of the array.
Example Input:
Input 1:
A = [16, 17, 4, 3, 5, 2]
Input 2:
 A = [5, 4]
Example Output:
Output 1:
[17, 2, 5]
Output 2:
[5, 4]
 */
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        leadersInAnArray(A);
    }
    public static void leadersInAnArray(int[] A){
        int leader=A[A.length-1];
        System.out.println(leader);
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(leader);
        for (int i = A.length-1; i>=0; i--) {
            System.out.println(A[i]);

            if(leader<A[i]){
                leader=A[i];
                ar.add(leader);

            }
        }
        System.out.println(ar);
    }
}
