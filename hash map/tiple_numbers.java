mport java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int c=0;
        Map<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
            int curr=nums[i];
            if(map.containsKey(3*curr)){
                 return true;
            }
            if(curr%3==0 && map.containsKey(curr/3))
                return true;
               
            map.put(curr,i);    
        }

        if(c>1){
            return true;
        }
        return false;
    
    }
}
