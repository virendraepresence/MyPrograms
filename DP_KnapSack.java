public class DP_KnapSack {
    public static void main(String[] args) {
        int n = 5;
        int[] vals = {15,14,10,45,30};
        int[] wts = {2,5,1,3,4};
        int cap = 7;


        int[][] dp = new int[n+1][cap + 1];
        for(int i = 1; i<dp.length; i++){
            for(int j = 1; j<dp[0].length; j++){
                if(j >= wts[i -1]){
                    int remainingCapacity = j - wts[i-1];
                    if(dp[i-1][remainingCapacity] + vals[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][remainingCapacity] + vals[i-1];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][cap]);

    }
}
