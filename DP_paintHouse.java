public class DP_paintHouse {
    public static void main(String[] args) {
        int[][] arr = {{1,5,7},
                        {5,8,4},
                        {3,2,9},
                        {1,2,4}};

        int n = arr.length;
        int m = 3;

        long[][] dp = new long[n][m];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        // System.out.print(dp[0][0]+ " ");
        // System.out.print(dp[0][1]+ " ");
        // System.out.println(dp[0][2]);

        for(int i = 1; i<n; i++){
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            // System.out.print(dp[i][0] + " ");
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]); 
            // System.out.print(dp[i][1]+ " ");
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][1], dp[i-1][0]);
            // System.out.println(dp[i][2]);
        }
        long answer = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        System.out.println(answer);
    }
}
