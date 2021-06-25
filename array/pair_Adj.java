import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        int c=0;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=1;i<nums.length;i++){
            int sum=nums[i];
            sum+=nums[i-1];
            if(sum>k){

                if(nums[i]<sum-k)
                    nums[i]=0;
                else
                    nums[i]=nums[i]-(sum-k);    
            c=c+(sum-k);
            }
            c=c%mod;
        }
        return c;
    }
}
