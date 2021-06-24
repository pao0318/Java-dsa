import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
        if(nums.length==0||nums==null)
            return false;

            Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(map.containsKey(k-sum))
                return true;
        
            map.put(sum,i);
                    
        }
        return false;
    }
        
    }
