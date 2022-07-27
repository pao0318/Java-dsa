// https://binarysearch.com/room/Is-Is-7sdOdcpfZ7
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        
        return helper(-1,0,nums);
    
    }
    public int helper(int prev,int curr,int[]nums){
        if(curr==nums.length)
            return 0;
        
        int op=0;
        if(prev==-1 || nums[prev]<nums[curr])
            op=1+helper(curr,curr+1,nums);
        
        int op2=helper(prev,curr+1,nums);

        return Math.max(op,op2);
    }
}
