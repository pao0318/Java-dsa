// https://leetcode.com/problems/rotate-array/submissions/
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        if(n==0)
            return;
        k=k%nums.length;
        rev(0,n,nums);
        
        rev(0,k-1,nums);
        rev(k,n,nums);
        
      
    }
    public void rev(int start, int end, int[]nums){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
