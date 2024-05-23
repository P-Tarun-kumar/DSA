import static java.lang.Integer.*;

public class MaxProduct {
    public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6};
        System.out.println(maxProduct(arr));
    }

    public static String maxProduct(int[] intArray) {
        String str="";
        int maxP = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] + intArray[j]) > maxP) {
                    maxP = intArray[i] + intArray[j];
                    str=intArray[i] +","+ intArray[j] ;
                }
            }
        }
        return str;
    }
}