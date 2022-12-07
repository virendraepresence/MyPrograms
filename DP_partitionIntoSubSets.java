public class DP_partitionIntoSubSets {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        if(k==0 || k>n || n==0){
            System.out.println(0);
            return;
        }
        long[][] dp = new long[k+1][n+1];

        for(int i = 1; i<= k; i++){
            for(int j = 1; j <= n; j++){
                if(i>j){
                    dp[i][j] = 0;
                }else if(i==j){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1] * i;
                }
            }
        }

        System.out.println(dp[k][n]);
        
    }
}
