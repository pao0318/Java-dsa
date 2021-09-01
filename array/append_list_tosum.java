
import java.util.*;

class Solution {
    public int solve(int[] nums, int k, int target) {
        int sum=0;
        for(int j:nums)
            sum+=j;

        target=target-sum;
        if(target<0){
            target=target*(-1);
        }
        int c=0;
        while(target>0){
            target-=k;
            c++;
        }
        return c;


    }
}
