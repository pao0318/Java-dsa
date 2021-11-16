// https://leetcode.com/problems/delete-and-earn/submissions/
class Solution {
    public int deleteAndEarn(int[] nums) {
      if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int dp[] = new int[10001]; 
        for (int i = 0; i < nums.length; i++) {
            dp[nums[i]] += nums[i]; // add them to dp  
        }
        int rob1=0;
        int rob2=0;
		
        for (int i=0;i<dp.length;i++) {
            int temp = Math.max(dp[i]+rob1, rob2); 
            rob1=rob2;  
            rob2=temp;
        }
        return rob2; 
    }
        
    
}
