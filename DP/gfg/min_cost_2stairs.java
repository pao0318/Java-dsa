// 
class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
      

        
        for(int i=2;i<dp.length;i++){
            int onestep=cost[i-1]+dp[i-1];
            int twostep=cost[i-2]+dp[i-2];
            
            dp[i]=Math.min(onestep,twostep);
        }
        return dp[dp.length-1];
    }
}
