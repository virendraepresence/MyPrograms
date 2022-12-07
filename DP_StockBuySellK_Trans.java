public class DP_StockBuySellK_Trans {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {9,6,7,6,3,8};
        int k = 3;

        int[][] dp = new int[k+1][n];


        for(int i = 1; i<= k; i++){
            int max = Integer.MIN_VALUE;

            for(int j = 1; j<arr.length; j++){
                if(dp[i-1][j-1] - arr[j-1] > max){
                    max = dp[i-1][j-1] - arr[j-1];
                }

                if(max + arr[j] > dp[i][j-1]){
                    dp[i][j] = max + arr[i];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        System.out.println(dp[k][n-1]);
    }
}
