public class DP_painHouseVaryClr {
    public static long painHouseWays1(int[][] arr, int n, int m){
        long[][] dp = new long[n][m];
        for(int j = 0; j<m; j++){
            dp[0][j] = arr[0][j];
        }
        
        for(int i = 1; i<n; i++){
            for(int j = 0; j<m; j++){
                long min = Integer.MAX_VALUE;
                for(int k = 0; k<m; k++){
                    if(k != j){
                        min = Math.min(min, dp[i-1][k]);
                    }
                }

                dp[i][j] = arr[i][j] + min;
                
            }
        }

        long min = Integer.MAX_VALUE;
        for(int k = 0; k<m; k++){
            min = Math.min(min, dp[n-1][k]);
        }
        
        
        return min;

    }

    public static long painHouseWays2(int[][] arr, int n, int m){
        long[][] dp = new long[n][m];
        long least = Integer.MAX_VALUE;
        long secondLeast = Integer.MAX_VALUE;

        for(int j = 0; j<m; j++){
            dp[0][j] = arr[0][j];

            if(least >= arr[0][j]){
                secondLeast = least;
                least = arr[0][j];
            }else{
                secondLeast = arr[0][j];
            }
        }
        
        for(int i = 1; i<n; i++){
            long tempLeast = Integer.MAX_VALUE;
            long tempSecondLeast = Integer.MAX_VALUE;
            for(int j = 0; j<m; j++){
                if(least == arr[i-1][j]){
                    dp[i][j] = arr[i][j] + secondLeast;
                }else{
                    dp[i][j] = arr[i][j] + least;
                }

                if(tempLeast >= dp[i][j]){
                    tempSecondLeast = tempLeast;
                    tempLeast = dp[i][j];
                }else{
                    tempSecondLeast = dp[i][j];
                }
            }

            secondLeast = tempSecondLeast;
            least = tempLeast; 

        }

        
        
        return least;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,5,7},
                        {5,8,4},
                        {3,2,9},
                        {1,2,4}};

        int n = arr.length;
        int m = arr[0].length;

        long answer = painHouseWays1(arr, n, m);
        long answer2 = painHouseWays2(arr, n, m);

        System.out.println(answer);
        System.err.println("answer2: " + answer2);

        
    }
}
