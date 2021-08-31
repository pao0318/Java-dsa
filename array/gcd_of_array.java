import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int min=Integer.MAX_VALUE;
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=gcd(nums[i],res);
            if(res==1)
                return 1;
        }   
        return res;
    }

        public int gcd(int x, int y){
            if(x==0)
                return y;
            return gcd(y%x,x);    
        }
    }
