// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/#
class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int lo=Integer.MIN_VALUE;
        int high=0;
        int res=-1;
        for(int k:A){
             high+=k;
             lo=Math.max(lo,k);
        }
        
        while(lo<=high){
            int mid=(high-(high-lo)/2);
            if(isValid(mid,A,M,N)){
                res=mid;
                high=mid-1;
            }
            else
                lo=mid+1;
                
        }
        return res;
        
    }
    
    
    public static boolean isValid(int mid, int []A, int M, int N){
        
        int curr_sum=0;
        int students=1;
        for(int i=0;i<N;i++){
            if((curr_sum+A[i])<=mid)
                curr_sum+=A[i];
            else{
                students++;
                curr_sum=A[i];
            }
        }
        return students<=M;
        
        
    }
};
