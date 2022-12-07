import java.nio.charset.MalformedInputException;

public class DP_CountStairs {
    public static void main(String[] args) {
        int n = 10;
        int answer = countpaths(n, new int[n+1]);
        int answer2 = countpathsTabulation(n);
        System.out.println(answer + " " + answer2);
    }

    public static int countpaths(int n, int[] dp) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] > 0) return dp[n];

        int cp1 = countpaths(n-1, dp);
        int cp2 = countpaths(n-2, dp);
        int cp3 = countpaths(n-3, dp);
        int cp = cp1 + cp2 + cp3;
        dp[n] = cp;
        return cp;
    }

    public static int countpathsTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }
}
