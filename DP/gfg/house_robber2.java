// https://leetcode.com/problems/house-robber-ii/submissions/
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==0)
            return 0;
        
        int[]dp=new int[nums.length];
        dp[0]=0;
        dp[1]=Math.max(dp[0],nums[1]);
        int ans1=0;
        int ans2=0;
        
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        ans1=dp[nums.length-1];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        
        for(int i=2;i<nums.length-1;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        ans2=dp[nums.length-2];
        return Math.max(ans1,ans2);
    }
}
