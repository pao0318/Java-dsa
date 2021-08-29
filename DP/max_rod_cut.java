// https://practice.geeksforgeeks.org/problems/cutted-segments1642/1#
\class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       int []dp=new int[n+1];
       for(int i=1;i<=n;i++){
           dp[i]=Integer.MIN_VALUE;
           if(i>=x)
                dp[i]=Math.max(dp[i],1+dp[i-x]);
            if(i>=z)
                dp[i]=Math.max(dp[i],1+dp[i-z]);
            if(i>=y)
                dp[i]=Math.max(dp[i], 1+dp[i-y]);
       }
            return dp[n]<0?0:dp[n];    
                
       
   
    }
}
