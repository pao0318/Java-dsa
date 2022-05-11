// https://leetcode.com/problems/delete-and-earn/submissions/
class Solution {
    public int deleteAndEarn(int[] nums) {
      if (nums == null || nums.length == 0) 
            return 0;
        int inc=0;
        int exc=0;
        
        int count[]=new int[10001];
        for(int val:nums)
            count[val]++;
        
        for(int i=0;i<10001;i++){
            int ni=exc+count[i]*i;
            int ne= Math.max(inc,exc);
            inc=ni;
            exc=ne;
        }
        return Math.max(inc,exc);
        
    }  
}
