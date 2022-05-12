// https://leetcode.com/problems/unique-paths/
class Solution {
  
    public int uniquePaths(int m, int n) {
        if(m==1)
            return 1;
        
        if(n ==1)
            return 1;
      
        int[][]dp= new int[m+1][n+1];
        dp[0][0]=1;
        for(int i=1;i<m;i++)
            dp[i][0]=dp[i-1][0];
        for(int i=1;i<n;i++)
            dp[0][i]=dp[0][i-1];
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
