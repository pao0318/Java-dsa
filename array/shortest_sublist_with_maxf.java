import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        int max_freq=1;
        int mini=Integer.MAX_VALUE;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);

            if(map.get(nums[i]).size()>max_freq)  
                max_freq=map.get(nums[i]).size();

        }
        for(Map.Entry<Integer,ArrayList<Integer>>x:map.entrySet()){
            ArrayList<Integer> list=x.getValue();
            int size=list.size();
            if(size==max_freq)
                mini=Math.min(mini,list.get(size-1)-list.get(0)+1);
        }
        return mini;

}
}
