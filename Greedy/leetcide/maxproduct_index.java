// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/submissions/
class Solution {
    public int getMaxLen(int[] nums) {
        int negative_Found = -1, zero_Found = -1, total_Negatives = 0, max_Length = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                total_Negatives++;
                if(negative_Found == -1)    negative_Found = i;
            }
            if(nums[i] == 0){
                zero_Found = i;
                total_Negatives = 0;
                negative_Found = -1;
            }else{
                if(total_Negatives % 2 == 0){
                    max_Length = Math.max(i - zero_Found , max_Length); 
                }else{
                    max_Length = Math.max(i - negative_Found , max_Length);
                }
            }
        }
        return max_Length;
    }
}
