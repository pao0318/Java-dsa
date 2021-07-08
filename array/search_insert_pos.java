class Solution {
    public int searchInsert(int[] nums, int target) {
        int h=nums.length;
        if(h==0||target==0)
            return 0;
        int l=0;
        return search(nums,l,h-1,target);
        
    }
    public int search(int[]arr, int l,int h,int target){
        if(h>=l){
            int mid=l+((h-l)/2);
            
        if(arr[mid]==target)
                return mid;
      
            
        if(arr[mid]>target)
                return search(arr,l,mid-1,target);
        else
                return search(arr,mid+1,h,target);
        }
        return l;
    }
}
