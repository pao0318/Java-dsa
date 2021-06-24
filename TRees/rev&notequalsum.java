import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            int rev=i-reverse(i);
            map.put(rev,map.getOrDefault(rev,0)+1);
        }
        long sol=0;
        for(int key:map.keySet()){
            int value=map.get(key);
            sol+=((long)value)*(value+1)/2;
        }
        return (int)(sol%1000000007);
    }
    public int reverse(int n){
        StringBuilder s=new StringBuilder(Integer.toString(n));
        String rev1=s.reverse().toString();
        return Integer.valueOf(rev1);
    }
}
