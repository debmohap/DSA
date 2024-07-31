package com.Matrices;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] B = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
//        System.out.println(B[1][0]);
        int N=B.length;
        int M=B[0].length;
        // Row sum
        for (int i = 0; i < N; i++) {
            int sum=0;
            for (int j = i; j < M; j++) {
                sum=sum+B[i][j];
            }
            System.out.println(sum);
        }
        //column sum
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum +=B[j][i];
            }
            System.out.println(sum);
        }
        // Print all the diagonal left to button right
        for (int i = 0; i < N; i++) {
            System.out.println(B[i][i]);
        }
        // Print all the diagonal right to button left
        int k=0;
        int count=N;
        for (int i = 0; i < N; i++) {
            System.out.println(k +"......"+count);
            k++;
            count--;
        }
    }
}
