// 
class Solution {
    public boolean canJump(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i>index) return false;
            index=Math.max(i+nums[i],index);
        }
        return true;
    }
}
