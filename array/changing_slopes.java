import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int counter=0;
        int rest=0;
        // boolean dec=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                if(rest==-1){
                    counter++;
                }
                rest=1;
            }
            else if(nums[i]<nums[i-1]){
                if(rest==1)
                    counter++;
                rest=-1;
                
            }
                else{
                    rest=0;;
                }
            
        }
        return counter;
    }
}
