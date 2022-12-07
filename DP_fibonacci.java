public class DP_fibonacci {
    public static void main(String[] args) {
        int n = 10;
        // int[] dp = new int[n+1];
        int answer = fibonacciDP(n, new int[n+1]);
        // System.out.println(answer);
    }

    public static int fibonacciDP(int n, int[] dp){
        if(n== 0 || n == 1) return n;

        if(dp[n] != 0) return dp[n];
        
        
        int fib1 = fibonacciDP(n-1, dp);
        int fib2 = fibonacciDP(n-2, dp);
        int fib = fib1 + fib2;
        System.out.print(fib+ " ");
        dp[n] = fib;
        return fib; 
    }
}
