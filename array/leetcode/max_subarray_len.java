class Solution {
    public int getMaxLen(int[] nums) {
        int pro=1;
        int prev=-1;
        int max_len=0;
        
        for(int i=0;i<nums.length;i++){
            pro=pro*nums[i];
            if(pro!=0)
                pro=pro/Math.abs(pro);
            if(pro==0){
                prev=i;
                pro=1;
            }
            else if(pro>0){
                max_len=Math.max(max_len, i-prev);
            }
        }
        
        pro=1;
        prev=nums.length;
        
           for(int i=nums.length-1;i>=0;i--){
            pro=pro*nums[i];
               if(pro!=0)
                pro=pro/Math.abs(pro);
            if(pro==0){
                prev=i;
                pro=1;
            }
            else if(pro>0){
                max_len=Math.max(max_len, prev-i);
            }
        }
        
        return max_len;
        
        
    }
}
