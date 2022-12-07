public class DP_StockBuySellMultiTranWithFee {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {10,20,30};
        int fee = 2;

        int oldBuyingState = -arr[0];
        int oldSellingState = 0;
        // int profit = 0;

        for(int i = 1; i<n; i++){
            int newBuyingState = 0;
            int newSellingState = 0;
            if(oldSellingState - arr[i] > oldBuyingState){
                newBuyingState = oldSellingState - arr[i];
            }else{
                newBuyingState = oldBuyingState;
            }

            if(oldBuyingState + arr[i] - fee > oldSellingState){
                newSellingState = oldBuyingState + arr[i]-fee;
            }else{
                newSellingState = oldSellingState;
            }

            oldBuyingState = newBuyingState;
            oldSellingState = newSellingState;
        }
        System.out.println(oldSellingState);
    }
}
