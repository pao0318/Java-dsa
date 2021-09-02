import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        int n=nums.length;
        int []dp=new int[n+1];
        int max;
        // dp[0]=nums[0];
        for(int i=1;i<=n;i++){
            max=0;
            for(int j=i-1;j>=i-k &&j>=0;j--){
                max=Math.max(max,nums[j]);
                dp[i]=Math.max(dp[i],dp[j]+max*(i-j));
                
            }
        }
        return dp[n];

    }

}

