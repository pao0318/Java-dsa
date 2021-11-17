// https://leetcode.com/problems/jump-game-ii/submissions/
class Solution {
    public int jump(int[] nums) {
        int maxindex=0;
        int endindex=0;
        int count=0;
        int i=0;
        while(i<nums.length-1){
            maxindex=Math.max(maxindex, i+nums[i]);
            if(i==endindex){
                endindex=maxindex;
                count++;
            }
            i++;
        }
        return count;
    }
}
