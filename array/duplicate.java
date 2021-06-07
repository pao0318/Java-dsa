class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums,0,nums.length);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                    return nums[i];
            else
                continue;
        }
        return 0;
    }
}
