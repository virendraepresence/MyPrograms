import javax.sound.sampled.Port;

public class DP_StockBuySellOneTrans {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,3};

        int leastPriceSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;

        for(int i = 0; i<arr.length; i++){
            if(leastPriceSoFar>arr[i]){
                leastPriceSoFar = arr[i];
            }

            profitIfSoldToday = arr[i] - leastPriceSoFar;
            if(overallProfit < profitIfSoldToday){
                overallProfit = profitIfSoldToday;
            }
            
        }

        System.out.println(overallProfit);
    }
}
