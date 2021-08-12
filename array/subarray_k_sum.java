// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int solve(int[] nums, int k, int target) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];

        if((sum/k)>=target)
                c++;
        
        for(int j=k;j<nums.length;j++){
            
            sum-=nums[j-k];
            sum+=nums[j];
            if((sum/k)>=target)
                c++;    
        }
        return c;
        
    }
}
