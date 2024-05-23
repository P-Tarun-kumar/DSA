public class bitProblems {
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        if(n==0)
            return 0;
        if((n&1)!=0 || (n%2)!=0)
            return 1;
        int result=1;
        while(n>0){
            if(n%2==0)
                result++;
            else
                return result;
            n=n/2;
        }
        return result;
    }
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n)
            return -1;
        m=m^n;
        n=~m+1;
        n=m&n;
        if(n==0)
            return 0;
        if((n&1)!=0 || (n%2)!=0)
            return 1;
        int result=1;
        while(n>0){
            if(n%2==0)
                result++;
            else
                return result;
            n=n/2;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18));
        System.out.println(posOfRightMostDiffBit(52,4));
    }
}
