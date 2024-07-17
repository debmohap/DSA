package class3.prifixSum;

import java.util.Arrays;

/*
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements
at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes,
then the corresponding sum of elements is considered as 0.
Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
Example Input:
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:
A = [1, 2, 3]
Example Output:
Output 1:
3
Output 2:
-1
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(equilibrium(A));
        //BrutForce
//        int[] PS = new int[A.length];
//
//        PS[0] = A[0];
//        for (int i = 1; i < A.length; i++)
//            PS[i] = PS[i - 1] + A[i];
//        System.out.println(Arrays.toString(PS));
//        for (int i = 0; i < A.length; i++) {
//            int sL = 0;
//            int sR = 0;
//            for (int j = 0; j < i; j++)
//                sL = sL + A[j];
//
//            for (int j = i + 1; j < A.length; j++)
//                sR = sR + A[j];
//            if (sL == sR)
//                System.out.println("present");
//        }

    }
    public static int equilibrium(int[] A){

        int[] PS = new int[A.length];
        int lSum=0;
        int rSum=0;
        PS[0] = A[0];
        for (int i = 1; i < A.length; i++)
            PS[i] = PS[i - 1] + A[i];
        for (int i = 0; i < PS.length; i++) {
            if (i==0)
                lSum=0;
            else
                lSum=PS[i-1];
            rSum=PS[PS.length-1]-PS[i];
        }
        if (lSum==rSum){
            return 1;
        }
        return -1;
    }
}
