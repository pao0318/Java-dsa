/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakFindIndex(mountainArr,0,mountainArr.length()-1);
      
        int res= helperfind(target, mountainArr, 0,peak);
        
        if(res!=-1)
            return res;

        return helperfind(target, mountainArr, peak+1,mountainArr.length()-1);
        
        
    }
    
    int peakFindIndex(MountainArray mountainArr,int start,int end){
        
        while(start<end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    
     int helperfind(int target, MountainArray mountainArr, int start, int end){
         
        boolean asc=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)==target)
                return mid;
            if(asc){
                if(mountainArr.get(mid)<target){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            else{
                if(mountainArr.get(mid)<target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
            return -1;
     
        
    }
    
      
            
}
