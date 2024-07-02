package class1;

/*
Problem Description:
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6
 */
public class CountOfFactors {
    public static void main(String[] args) {
        System.out.println(countNo(100));

    }
    public static int countNo(int A){
        int count=0;
        for (int i = 1; i*i<=A; i++) {
         if(A%i==0){
             if (i==A/i){
                 count++;
             }else {
                 count=count+2;
             }

         }
        }
        return count;
    }
}
