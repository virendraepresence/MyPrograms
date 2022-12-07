public class DP_countStairsVar {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 3, 0, 2, 2, 3};

        int[] dp = new int[n+1];
        dp[n] = 1;

        for(int i = n-1; i>=0; i--){
            for(int j = 1; j<=arr[i] && i+j <= n; j++){
                dp[i] += dp[i+j];
            }
        }
        
        System.out.println(dp[0]);

    }


}
