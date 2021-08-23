// https://practice.geeksforgeeks.org/problems/gold-mine-problem2608/1#
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int [][]dp =new int[n][m]; #doubt for n+1 m+1
        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(j==m-1)
                    dp[i][j]=M[i][j];
                else if(i==0)
                    dp[i][j]=M[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                else if(i==n-1)
                    dp[i][j]=M[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                else
                    dp[i][j]=M[i][j]+ Math.max(dp[i-1][j+1], Math.max(dp[i][j+1],dp[i+1][j+1]));
                    
            }
        }
        int max = 0;
      for (int i = 0; i < n; i++) {
         max = Math.max(max, dp[i][0]);
      }
        return max;
    }
}
