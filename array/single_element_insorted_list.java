// https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/
class Solution {
    public int singleNonDuplicate(int arr[]) {
        int low=0;
        int high=arr.length-2;
        while(low<=high){
            int mid=(high-(high-low)/2);
            
            if(mid%2==0){
                if(arr[mid]!=arr[mid+1])
                    high=mid-1;
                else
                    low=mid+1;
                
            }
            else{
                if(arr[mid]==arr[mid+1])
                    high=mid-1;
                else
                    low=mid+1;
                
            }
        }
        return arr[low];
    }

}
