import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 5};
        System.out.println(Arrays.toString(findTopTwoScores(array)));
    }

    public static int[] findTopTwoScores(int[] array) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                second_max = max;
                max = array[i];
            }else if(array[i] >second_max && array[i]<max){
                second_max=array[i];
            }
        }
        return new int[]{max,second_max};
    }
}