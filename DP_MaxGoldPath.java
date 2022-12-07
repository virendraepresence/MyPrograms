public class DP_MaxGoldPath {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4,8,6,7,5,10},
        //                 {1,5,3,5,8,4,7,5,2},
        //                 {1,2,3,4,8,6,9,4,7},
        //                 {5,5,7,0,4,5,7,4,8},
        //                 {1,2,3,4,5,6,3,5,5},
        //                 {7,10,3,4,3,6,7,2,6},
        //                 {1,2,11,4,2,6,10,5,4},
        //                 {12,2,3,4,8,4,7,10,5}};
        
        int[][] arr = {{2},{2},{2},{3},{4},{5}};
        int n = arr.length;
        int m = arr[0].length;


        int[][] dp = new int[n][m];

        for(int j = m-1; j>=0; j--){
            for(int i = n-1; i>=0; i--){
                if(j == m-1){
                    dp[i][j] = arr[i][j];
                }else if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }else if(i == n-1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }

        int max = dp[0][0];
        for(int i = 1; i<n; i++){
           max = Math.max(max, dp[i][0]);
        }

        System.out.println(max);
    }
}
