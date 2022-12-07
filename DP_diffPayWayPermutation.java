public class DP_diffPayWayPermutation {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {2,3,5,6};
        int targetAmount = 10;

        int[] dp = new int[targetAmount+1];
        dp[0] = 1;
        for(int amt = 1; amt<=targetAmount; amt++){
            for(int coin : arr){
                if(coin <= amt){
                    int remainingAmount = amt - coin;
                    dp[amt] += dp[remainingAmount];
                }
            }
        }

        System.out.println(dp[targetAmount]);
    }
}
