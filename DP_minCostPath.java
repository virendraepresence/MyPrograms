public class DP_minCostPath {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,8,6,7,5,10},
                        {1,5,3,5,8,4,7,5,2},
                        {1,2,3,4,8,6,9,4,7},
                        {5,5,7,0,4,5,7,4,8},
                        {1,2,3,4,5,6,3,5,5},
                        {7,10,3,4,3,6,7,2,6},
                        {1,2,11,4,2,6,10,5,4},
                        {12,2,3,4,8,4,7,10,5}};
        
        int n = arr.length;
        int m = arr[0].length;


        int[][] dp = new int[n][m];

        for(int i = dp.length - 1; i>=0; i--){
            for(int j = dp[0].length-1; j>=0; j--){
                if(i==dp.length -1 && j==dp[0].length -1){
                    dp[i][j] = arr[i][j];
                }else if(i== dp.length -1){
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                }else if(j == dp[0].length -1){
                    dp[i][j] = arr[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = arr[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
                }
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        } 

        System.out.println(dp[0][0]);
    }
}
