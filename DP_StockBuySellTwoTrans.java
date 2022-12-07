public class DP_StockBuySellTwoTrans {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {10,20,30};

        int maxProfitIfSold_UptoToday = 0;
        int leastPriceSoFar = arr[0];
        int[] dpLeft = new int[n];
            
        for(int i = 1; i<n; i++){
            if(arr[i] < leastPriceSoFar){
                leastPriceSoFar = arr[i];
            }

            maxProfitIfSold_UptoToday = arr[i] - leastPriceSoFar;
            if(dpLeft[i-1] < maxProfitIfSold_UptoToday){
                dpLeft[i] = maxProfitIfSold_UptoToday;
            }else{
                dpLeft[i] = dpLeft[i-1];
            }
        }

        int maxProfitIfBought_Today = 0;
        int maxProfitIfBought_AfterToday = arr[n-1];
        int[] dpRight = new int[n];
        for(int i = n-2; i>=0; i--){
            if(arr[i] > maxProfitIfBought_AfterToday){
                maxProfitIfBought_AfterToday = arr[i];
            }

            maxProfitIfBought_Today = maxProfitIfBought_AfterToday - arr[i];
            if(maxProfitIfBought_Today > dpRight[i+1]){
                dpRight[i] = maxProfitIfBought_Today;
            }else{
                dpRight[i] = dpRight[i+1];
            }
        }

        int overallProfit = 0;
        for(int i =0; i<n; i++){
            if(dpLeft[i] + dpRight[i] > overallProfit){
                overallProfit = dpLeft[i] + dpRight[i];
            }
        }

        System.out.println(overallProfit);
    }




}
