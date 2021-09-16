import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int ans=0;
        int flip=0;
        if(nums.length==1 &&nums[0]==1)
            return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 &&flip%2==0){
                flip++;
                ans++;
            }
            if(nums[i]==0 && flip%2!=0){
                ans++;
                flip++;
            } 
        }
        return ans;
    }
}
