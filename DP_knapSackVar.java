public class DP_knapSackVar {
    public static void main(String[] args) {
        int n = 5;
        int[] vals = {15,14,10,45,30};
        int[] wts = {2,5,1,3,4};
        int cap = 7;

        // dp = { 0, 15, , , , }


        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for(int i = 1; i<dp.length; i++){
            int max = 0;
            for(int j = 0; j<n; j++){
                if(wts[j] <= i){
                    int remainingCapacity = i - wts[j];
                    int temp = dp[remainingCapacity] + vals[j];
                    if(temp > max){
                        max = temp;
                    }
                }
                
            }
            dp[i] = max;
        }

        System.out.println(dp[cap]);
    }
}
