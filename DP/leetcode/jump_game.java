// 
class Solution {
    public boolean canJump(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i>index) return false;
            index=Math.max(i+nums[i],index);
        }
        return true;
    }
}


// dp
class Solution {
    public boolean canJump(int[] nums) {
        int[]dp=new int[nums.length];
    
        dp[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            if(i>dp[i-1])
                return false;
       dp[i] = Math.max(dp[i - 1], i + nums[i]);
            
        }
      return true;
    }
}
