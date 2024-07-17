package class2.arrays1;

public class ReverseArrayWithRang {
    public static void main(String[] args) {

    }
    public static int[] reverseArrayWithRang (int[] A,int s,int e){
        int i=s;
        int j=e;
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
