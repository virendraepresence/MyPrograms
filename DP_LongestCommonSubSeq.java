public class DP_LongestCommonSubSeq {
    public static void main(String[] args) {
		String str1 = "Krushna";
		str1 = str1.toLowerCase();
		String str2 = "Rout";
		str2 = str2.toLowerCase();
		int n=str1.length(),m=str2.length();
		int[][] dp = new int[str1.length() + 1][str2.length()+1];
        for(int i=0;i<=n;i++)dp[i][0]=0;
        for(int i=0;i<=m;i++)dp[0][i]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        // for printing longest common subsequence
        int i=str1.length(),j=str2.length();
        while(i>0 && j>0){    // if any of this i and j becomes 0 means one string is empty 
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));    //if character matches then add that to result string and move diagonally up
                i--;j--;
            }
            else{
                if(dp[i][j-1] > dp[i-1][j]) j--;    // else find the max of up and right position of dp table and move accordingly to up or left
                else i--;
            }
        }
        // str.reverse();    // reverse the string as we started from last
        System.out.println(sb.reverse());
        int lcsLength = dp[0][0];
        System.out.println(lcsLength);
    }
	

}
