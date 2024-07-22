package com.prifixSum;

public class EvenNumbersInARange {
    /*
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].For every query, your task is
to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 Input 1:
A = [1, 2, 3, 4, 5] ----> [0,1,1,2,2]
B = [   [0, 2] --> 1-0=1
        [2, 4] --> 2-1=1
        [1, 4]]--> 2-1=1
Input 2:
A = [2, 1, 8, 3, 9, 6]
B = [   [0, 3]
        [3, 5]
        [1, 3]
        [2, 4]   ]
Example Output:
Output 1:
[1, 1, 2]
Output 2:
[2, 1, 1, 1]
 */
    public static void main(String[] args) {
/*

let A=[6,3,3,6,7,8,7,3,7]
output=[]

let B = [[2,6],[4,7],[6,7]]
//  console.log(A)
let PS=[];
if(A[0]%2==0){
    PS[0]=1
}
else{
    PS[0]=0
}
for(i=1;i<A.length;i++){
    if(A[i]%2==0){
        PS[i]=PS[i-1]+1
    }
    else{
         PS[i]=PS[i-1]
    }
}
 for (k = 0; k < B.length; k++) {
            let L = B[k][0];
            let R = B[k][1];
            if(L==0){
                console.log(PS[R])
                output.push(PS[R])
            }else{
                console.log(PS[R]-PS[L-1])
                 output.push(PS[R]-PS[L-1])
            }

 }
   console.log(output)


 */
    }

}
