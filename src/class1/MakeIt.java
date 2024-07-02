package class1;
/*
Given two integers A and B. A represents the count of mangoes and B represent the count
of slices of mangoes. Mango can be cut into three slices of mangoes. A glass of mango
shake can be formed by two slices of mangoes.

Find the maximum number of glasses of mango shakes you can make with A mangoes and B
slices of mangoes initially.

Input Format:
The First argument is an integer A.
The Second argument is an integer B.
Output Format:
Return the maximum number of glasses of mango shakes you can make.
Input 1:
    A = 19
    B = 0
Output 1:
    28

Input 2:
    A = 7
    B = 1
Output 2:
    11
 */
public class MakeIt {
    /*
     A=3B
                => 19*3=57/2=28
     1G=2B
     7*3+1=22/2=11
     */
    public static void main(String[] args) {
        System.out.println(makeItCount(7,1));
    }
    public static int makeItCount(int A,int B){
        return ((A*3)+B)/2;
    }
}
