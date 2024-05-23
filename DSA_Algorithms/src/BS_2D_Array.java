import java.util.Arrays;

public class BS_2D_Array {
    public static void main(String[] args) {
        int [][]arr={{1,2,1},{8,2,3},{1,2,3}};
        System.out.println(Arrays.toString(search(arr,8)));
        int [] a={1,2,3,4};
        System.out.println(a.length);
    }
    static int[] search(int [][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r< arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }else if (target>arr[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
