package com.subarrays;

public class A_AStartFromHere {
    public static void main(String[] args) {
        //print value of all the subarray starting at S and ending with E.
        int[] A = {1, 2, 3, 4};
//        pintSubArrays(A, 2, 3);
        //Return the sum of a given subArray
        int sum=sumSubArrays(A,2,3);

        // Print all the sub-array of given size N;
        printAllTheSubArray(A);

        //print the sum of every single sub-array of the given Array.
        printSumAllTheSubArray(A);
        /*in above printSumAllTheSubArray time complexity is still O(N^3) and with help PS
         we do it O(N^2) or we can use carry forward approach which is added inside that
         method in comment line*/

    }

    public static void pintSubArrays(int[] A, int s, int e) {
        for (int i = s; i <= e; i++) {
            System.out.print(A[i]);
        }
        System.out.println();

    }

    public static int sumSubArrays(int[] A, int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static void printAllTheSubArray(int[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j <A.length ; j++) {
                pintSubArrays(A,i,j);
            }
        }
    }
    public static void printSumAllTheSubArray(int[] A){
        System.out.println("...........................");
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j <A.length ; j++) {
                System.out.println(sumSubArrays(A,i,j));
            }
        }
//        int sum=0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = i; j <A.length ; j++) {
//                sum+=A[j];
//                System.out.println(sum);
//            }
//        }

    }
}
