package com.arrays1;
/*
given an array of size N count the
no. of elements which have at least one element grater then itself

-3, 2,6,8,5 ---- 5
 */
public class Test1 {
    public static void main(String[] args) {
        int[] A={2,5,1,4,8,0,8,1,3,8};

        System.out.println(A.length-maxNo(A));
    }
    public static int maxNo(int[] A){
        int count=0;
        int max=A[0];
        for (int i = 0; i <=A.length-1 ; i++) {
            if(A[i]>=max){
                if(A[i]==max){
                    count++;
                }else {
                    max=A[i];
                    count=0;
                }
            }
        }
        return count+1;
    }
}
