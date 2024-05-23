public class uniqueArray {
    public static void main(String[] args) {
    int [] arr={1,6,3,4,5,6};
    uniqueArray uA=new uniqueArray();
    System.out.println(uA.isUnique(arr));
    }
    //Write a program to check if an array is unique or not
    public  boolean isUnique(int[] intArray) {
         for(int i=0;i<intArray.length;i++){
             for(int j=i+1;j< intArray.length;j++){
                 if(intArray[i]==intArray[j])
                     return false;
             }
         }
         return true;
    }
}
