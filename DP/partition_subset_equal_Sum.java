// https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1#
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i:arr)
            sum+=i;
        if(sum%2!=0)
            return 0;
        int new_sum=sum/2;
        
        boolean [][]dp=new boolean[N+1][new_sum+1];
        for(int i=0;i<N+1;i++)
            dp[i][0]=true;
            
        for(int j=0;j<new_sum+1;j++)
            dp[0][j]=false;
            
        for(int i=1;i<N+1;i++){
        for(int j=1;j<new_sum+1;j++){
            if(arr[i-1]<=j)
                dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
            else
                dp[i][j]=dp[i-1][j];
                
        }
        }
        if(dp[N][new_sum])
            return 1;
        return 0;
        }
    
}
