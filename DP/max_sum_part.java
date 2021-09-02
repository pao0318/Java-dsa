import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        int n=nums.length;
        int []dp=new int[n];
        int max=Integer.MIN_VALUE;
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            max=nums[i];
            for(int j=i;j>i-k&&j>=0;j--){
                max=Math.max(nums[j],max);
                dp[i]=Math.max(dp[i],dp[j-1]+max*(i-j+1));
                
            }
        }
        return dp[n-1];

    }
}
