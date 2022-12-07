import java.nio.channels.SeekableByteChannel;

public class DP_StockBuySellMultiTrans {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,3};

        int buyingDate = 0;
        int sellingDate = 0;
        int profit = 0;

        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]){
                sellingDate++;
            }else{
                profit += arr[sellingDate] - arr[buyingDate];
                buyingDate = sellingDate = i;
            }
        }
        profit += arr[sellingDate] - arr[buyingDate];
        System.out.println(profit);

    }
}
