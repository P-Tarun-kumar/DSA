import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
      int [] array={1,2,2,3,4,4,5,1,3};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
    public static int[] removeDuplicates(int[] arr) {
      int []newArray=new int[arr.length];
      int index=0;
      for(int i=0;i<arr.length;i++){
          boolean flag=false;
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]) {
                  flag = true;
                  break;
              }
          }
          if(!flag){
              newArray[index++]=arr[i];
          }
      }
      return Arrays.copyOf(newArray,index);
    }
}
