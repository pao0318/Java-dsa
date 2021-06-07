class Solution{
    static int minJumps(int[] arr){
        int n=arr.length;
        int []dp=new int[n];
        for(int i=0;i<n;i++)
            dp[i]=Integer.MAX_VALUE;
        
        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]!=Integer.MAX_VALUE && arr[j]+j>=i){
                    if(dp[j]+1<dp[i])
                        dp[i]=dp[j]+1;
                }
                    
            }
        }
        if(dp[n-1]!=Integer.MAX_VALUE)
            return dp[n-1];
        else
            return -1;
    }
}
