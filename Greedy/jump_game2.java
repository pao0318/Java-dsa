// https://leetcode.com/problems/jump-game-ii/submissions/
class Solution {
    public int jump(int[] nums) {
        int maxindex=0;
        int endindex=0;
        int count=0;
        int i=0;
        while(i<nums.length-1){
            maxindex=Math.max(maxindex, i+nums[i]);
            if(i==endindex){
                endindex=maxindex;
                count++;
            }
            i++;
        }
        return count;
    }
}
// DP approach

class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
       int[]dp=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1]=0;
        
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            
            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min=Math.min(dp[j],min);
                if(min!=Integer.MAX_VALUE)
                    dp[i]=1+min;
            }
        }
        return dp[0];
        
    }
}
