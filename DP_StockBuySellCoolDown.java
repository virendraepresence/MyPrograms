public class DP_StockBuySellCoolDown {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {10,20,30};
        // int fee = 2;

        int oldBuyingState = -arr[0];
        int oldSellingState = 0;
        int oldCooledState = 0;

        for(int i =1; i<n; i++){
            int newBuyingState = 0;
            int newSellingState = 0;
            int newCooledState = 0;

            if(oldBuyingState < oldCooledState - arr[i]){
                newBuyingState = oldCooledState - arr[i];
                
            }else{
                newBuyingState = oldBuyingState;
            }

            if(oldSellingState < oldBuyingState + arr[i]){
                newSellingState = oldBuyingState + arr[i];
                
            }else{
                newSellingState = oldSellingState;
            }


            if(oldCooledState < oldSellingState){
                newCooledState = oldSellingState;
            }else{
                newCooledState = oldCooledState;
            }

            oldBuyingState = newBuyingState;
            oldSellingState = newSellingState;
            oldCooledState = newCooledState;
        }

        System.out.println(oldSellingState);
    }
}
