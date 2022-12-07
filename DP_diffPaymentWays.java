public class DP_diffPaymentWays {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {2,3,5};
        int amount = 7;

        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i = 0; i<n; i++){
            for(int j = arr[i]; j<dp.length; j++){
                dp[j] += dp[j-arr[i]];
            }
        }

        System.out.println(dp[amount]);

    }
}
