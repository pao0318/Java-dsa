import java.util.*;

class Solution {
    public int solve(int n) {

        if(n<=3)
            return n;
    int[]dp=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    dp[2]=2;
    dp[3]=3;
    for(int i=4;i<n+1;i++){
        dp[i]=i;
        for(int j=2;j<=Math.sqrt(i);j++){
            dp[i]=Math.min(dp[i],1+dp[i-(j*j)]);
        }
    }
    return dp[n];
}
}
