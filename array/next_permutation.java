// https://leetcode.com/problems/next-permutation/submissions/
class Solution {
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[]nums, int first, int last){
        while(first<=last)
            swap(nums,first++,last--);
        
    }
    
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
        
    }
}
