import java.sql.SQLOutput;

public class removeDuplicates {
    public static void main(String[] args) {
        int []array={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(array));
    }
    //REMOVE DUPLICATES AND RETURN NEW LENGTH OF THE ARRAY
    public static int removeDuplicates(int[] nums) {
        int count=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count--;
            }
        }
        return count;

    }

}
