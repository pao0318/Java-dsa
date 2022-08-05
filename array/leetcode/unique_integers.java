// https://binarysearch.com/room/Is-Is-7sdOdcpfZ7?questionsetIndex=3
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            i=binary(nums,nums[i]);
            c++;
        }
        return c;
    }
    public int binary(int[]nums, int target){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return res;
    }
}
