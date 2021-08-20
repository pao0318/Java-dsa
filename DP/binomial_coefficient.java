// https://practice.geeksforgeeks.org/problems/ncr1019/1#

class Solution{
    static int nCr(int n, int r)
    {
        int[][]dp=new int[n+1][r+1];
            
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=Math.min(i,r);j++){
                if(i==j||j==0)
                    dp[i][j]=1;
                else
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%1000000007;
            }
        }    
        
        return dp[n][r];
        
    }
}
