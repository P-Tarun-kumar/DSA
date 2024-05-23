import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
    int [] arr1={1,2,3,4,5};
    int [] arr2={5,3,1,2,4};
    ArrayPermutation AP=new ArrayPermutation();
    System.out.println(AP.permutation(arr1,arr2));
    }
    //IF SUM AN MULTIPLICATION OF BOTH THE ARRAYS ARE EQUAL THEN WE CAN SAY THAT BOTH THE ARRAYS PERMUTATION IS TRUE
    public boolean permutation(int[] array1, int[] array2){
        if(array1.length!= array2.length)
            return false;
        int sum1=0,sum2=0,mul1=1,mul2=1;
        for(int i=0;i<array2.length;i++){
            sum1+=array1[i];
            sum2+=array2[i];
            mul1*=array1[i];
            mul2*=array2[i];
        }
        if(sum1==sum2 && mul1==mul2)
            return true;
        return false;
    }
}
