import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int key:nums){
        String temp=String.valueOf(key);
        if(temp.length()%2!=0)
            c++;
        }
        return c;
    }
    
}
