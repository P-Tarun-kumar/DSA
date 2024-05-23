public class ArrayList_insertion {
    public static <ArrayList> ArrayList<Integer> fillArrayList(int arr[], int n) {
        ArrayList<Integer> al = new Arraylist<>();
        for(int i=0;i<n;i++){
            al.add(arr[i]);
        }
        return al;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        ArrayList<Integer> al=new ArrayList<>();
        al=fillArrayList(arr,4);
        System.out.println("w");
    }
}
