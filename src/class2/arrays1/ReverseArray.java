package class2.arrays1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverseArray(A)));
    }
    public static int[] reverseArray(int[] A){
        int i=0;
        int j=A.length-1;
        while (i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        return  A;
    }
}
