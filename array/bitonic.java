// https://www.interviewbit.com/problems/search-in-bitonic-array/
public class Solution {
    public int solve(int[] A, int B) {
        int lo=0;
        int high=A.length-1;
        
        int index=findbitonic(lo,high,A);
       
        
        int t1=ascending(A,B,lo,index);
        int t2=descending(A,B,index+1,high);
        
        if(t1!=-1)
            return t1;
        if(t2!=-1)
            return t2;
        
        return -1;
        
        
    }
    
    
    public int findbitonic(int lo,int high, int[]A){
        int mid=(lo+high)/2;
        while(lo<=high){
              mid=(lo+high)/2;
              if(A[mid]>A[mid-1] && A[mid]>A[mid+1])
                return mid;
            else{
                if(A[mid]>A[mid+1] && A[mid]<A[mid-1])
                    high=mid-1;
                else
                    lo=mid+1;
            }
        }
        return mid;
    }
    
    
    public int ascending(int[]A, int B, int lo, int high){
        int mid=0;
        while(lo<=high){
              mid=(lo+high)/2;
            if(A[mid]==B)
                return mid;
            
            if(A[mid]<B)
                lo=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    
    
    public int descending(int[]A, int B, int lo, int high){
        int mid=0;
        while(lo<=high){
            mid=(lo+high)/2;
            if(A[mid]==B)
                return mid;
            
            if(A[mid]<B)
                high=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
}
