// https://leetcode.com/problems/maximum-sum-circular-subarray/submissions/
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxsubarray=Integer.MIN_VALUE;
        int maxcurr=0;
        int sum=0;
        
        
         for(int i=0;i<n;i++){
            sum+=nums[i];
            maxcurr+=nums[i];
            maxcurr=Math.max(maxcurr,nums[i]);
            maxsubarray=Math.max(maxcurr,maxsubarray);
            
        }
        
        int minsubarray=Integer.MAX_VALUE;
        int mincurr=0;
        for(int i=0;i<n;i++){
            mincurr+=nums[i];
            mincurr=Math.min(mincurr, nums[i]);
            minsubarray=Math.min(minsubarray, mincurr);
        }
        if((sum-minsubarray==0))
            return maxsubarray;
        
        return Math.max(maxsubarray, (sum-minsubarray));
    
       
        
        
    }
}
