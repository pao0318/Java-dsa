import java.util.*;

class Solution {
    public int solve(int[] nums, int target) {
        int start=0;
       
        int end=nums.length-1;
         int ind=end+1;
       
        while(start<=end){
            int mid=(start+end)/2;
            
            if(nums[mid]>target){
                ind=mid;
                end=mid-1;
            }
                
            else
                start=mid+1;        
        }
        return ind;

    }
}
