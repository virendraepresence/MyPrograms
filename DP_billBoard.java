import java.util.*;
public class DP_billBoard {
    public static void main(String[] args) {
        int[] x = {6,8,12,13,16};
        int[] rev = {5,8,5,3,1};
        int miles = 20;
        int gap = 3;
        int answer = solution(miles, x, rev, gap);
        System.out.println();
        System.out.println(answer);
    }

    public static int solution(int miles, int[] x, int[] rev, int gap){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<x.length; i++){
            map.put(x[i], rev[i]);
        }

        int[] dp = new int[miles+1];
        dp[0] = 0;
        for(int i=1; i<=miles; i++){
            if(map.containsKey(i) == false){
                dp[i] = dp[i-1];
            }else{
                int boardNotInstalled = dp[i-1];
                int boardInstalled = map.get(i);
                if(i>=gap+1){
                    boardInstalled += dp[i-gap-1];
                }
                dp[i] = Math.max(boardNotInstalled, boardInstalled);
            }
            System.out.print(dp[i]+ " ");
        }
        return dp[miles];
    }
}
