import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans+=helper(i,nums);
        }
        return ans;
    }
    int helper(int target, int[]nums){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return 1;
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;        
        }
        return 0;
    }
}
