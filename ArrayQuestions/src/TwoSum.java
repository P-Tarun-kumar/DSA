import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
    int []arr={2,7,11,15};
    int target=9;
    System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                if (i != j)
                    if ((nums[i] + nums[j]) == target){
                         return new int[]{i,j};
                    }
            }
        }
        throw new IllegalArgumentException("No two elements found which is equal to target ");
    }
}
