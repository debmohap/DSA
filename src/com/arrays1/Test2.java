package com.arrays1;
/*

Given an array of size N and a no. of K return True
if there is existing of pairs of A[i],A[j] such that A[i]+A[j]=K (i!=j)

A=[3,-2,1,4,3,6,8]
K=10 true
K=16; false
K=6  true
 */
public class Test2 {
    public static void main(String[] args) {
        int[] A={3,-2,1,4,3,6,8};
        System.out.println(existPair(A,16));
    }
    //brut force
    public static boolean existPair(int[] A,int K){
        for (int i = 0; i <=A.length-1; i++) {
            for (int j = 0; j <=A.length-1; j++) {
                if (A[i]+A[j]==K && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
