// https://leetcode.com/problems/jump-game-ii/submissions/
  class Solution {
    public int jump(int[] nums) {
    int[]dp=new int[nums.length];
        int c=0;
        int maxindex=0;
        int endindex=0;
        for(int i=0;i<nums.length-1;i++){
           maxindex=Math.max(maxindex,i+nums[i]);
            if(i==endindex){
                endindex=maxindex;
                c++;
            }
        
        }
        return c;
        
    }
}
