// https://leetcode.com/problems/maximum-product-subarray/submissions/
class Solution {
    public int maxProduct(int[] nums) {
    
        if(nums.length==1)
            return nums[0];
        
        int ans=Integer.MIN_VALUE;
        int currpro=1;
        
        for(int i=0;i<nums.length;i++){
            currpro*=nums[i];
            ans=Math.max(ans,currpro);
            if(currpro==0){
                currpro=1;
            }
        }
        
        currpro=1;
        
        for(int i=nums.length-1;i>=0;i--){
            currpro*=nums[i];
            ans=Math.max(ans,currpro);
            if(currpro==0){
                currpro=1;
            }
        }
        return ans;
     
    }
}
