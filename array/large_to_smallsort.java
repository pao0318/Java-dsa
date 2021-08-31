
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        if(nums.length==0)
            return new int[0];    
        Arrays.sort(nums);
        int[]arr=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<nums.length){
            arr[k++]=nums[j--];
            if(k>=nums.length)break;
            else arr[k++]=nums[i++];
        }
        return arr;
    }
}
