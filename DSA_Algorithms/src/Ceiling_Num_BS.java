public class Ceiling_Num_BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6,9};
        int target=7;
        System.out.println( ceilingBS(arr,target));
    }
    //ceiling-the smaller number which id greater than or equal to the target.
    static int ceilingBS(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
    }

