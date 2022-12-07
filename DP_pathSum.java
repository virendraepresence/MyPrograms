public class DP_pathSum {
    public static void main(String[] args) {
        int[] smallArr = {1,5,1,4,6,2,4,5,7};
        // int[] arr = {5,5,2,4,1,5,9,8,6,3,8,9,1};
        int[] arr = {1,1,1,4,9,8,1,1,10,1};

        int n = arr.length;
        Integer[] dp = new Integer[n+1]; 
        dp[n] = 0;
        for(int i = dp.length -2; i>=0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int k = 1; k <= arr[i] && i + k < dp.length; k++){
                    if(dp[i + k] != null){
                        if(min > dp[i+k]){
                            min = dp[i+k];
                        }
                    }
                    
                } 
                if(min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }else{
                    dp[i] = null;
                }
                
            }
        }

        System.out.println(dp[0]);

    }
}
