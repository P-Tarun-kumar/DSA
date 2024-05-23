public class maxProfit {
    public static void main(String[] args) {
        int [] array={7,1,5,3,5,4};
        System.out.println(maxProfit(array));
        System.out.println(EfficientmaxProfit(array));
    }
    //Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        int result=0;
        int var;
        for(int i=0;i<prices.length;i++){
            var=0;
            for(int j=i+1;j<prices.length;j++){
                if(i!=j)
                    if((prices[j]-prices[i])>var){
                        var=prices[j]-prices[i];
                    }
            }
            if(var>result)
                result=var;
        }
        return result;
    }
    //Best Time to Buy and Sell Stock
    //EFFICENT SOLUTION
    public static int EfficientmaxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice)
                 minPrice=price;
            else if((price-minPrice)>maxProfit)
                maxProfit=price-minPrice;
        }
        return maxProfit;
    }
}
