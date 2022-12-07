public class DP_countStairsMinMoves {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1,1,1,4,9,8,1,1,10,1};

        Integer[] dp = new Integer[n+1];
        dp[n] = 0;

        for(int i = n-1; i>= 0; i--){
            int min = Integer.MAX_VALUE;
            if(arr[i] > 0){
                for(int j = 1; j<=arr[i] && i+j <= n; j++){
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }
            }
            
            if(min != Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }

        System.out.println(dp[0]);

    }
}
