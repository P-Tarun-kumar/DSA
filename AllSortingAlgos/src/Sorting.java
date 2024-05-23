import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int [] arr={54,65,34,345,54};
        selectionSort(arr);
        BubbleSort(arr);
        selectionSort(arr);
//        insertionSort(arr);
    }
    static void BubbleSort(int [] arr){     //------------->O(N) time complexity
        int n=arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            if(minIndex!=i){
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int [] arr){
        for(int i=1;i< arr.length;i++){
            int temp=arr[i], j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int [] arr,int left,int middle,int right){

    }
    static void mergeSort(int [] arr,int left,int right){  //O(NlogN) merge method is not implemented do it later
        if(right>left){
            int mid=left+(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr ,left,mid,right);
        }
    }
    static int partion(int [] arr,int start,int end){
        return -1;
    }
}
