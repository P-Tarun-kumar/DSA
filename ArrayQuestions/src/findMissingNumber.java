public class findMissingNumber {
    public static void main(String[] args) {
      int []arr={1,2,3,4,6};
        System.out.println(findMissingNumberInArray(arr));
    }
    static int findMissingNumberInArray(int[] arr) {
        int sum=0;
        int sum2=0;
        int n=arr.length+1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum2=n*(n+1)/2;
        return sum2-sum;
    }
}
