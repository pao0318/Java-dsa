// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int fi=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                fi=mid;
                end=mid-1;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        
        int li=-1;
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                li=mid;
                start=mid+1;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return new int[]{fi,li};
        
    }
}
 
