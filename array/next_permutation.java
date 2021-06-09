class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i++){
            if(nums[i]>nums[i-1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(0,n-1);
        }
        else{
        int prev=idx;
        for(int i=idx+1;i<n;i++){
            if(nums[i]>nums[idx-1] && nums[i]<=nums[prev])
                prev=i;
            
        }
        swap(nums[prev],nums[idx-1]);
        reverse(idx, n-1);
    }
        
    }
//     Create custom function for reverse and swap
}
