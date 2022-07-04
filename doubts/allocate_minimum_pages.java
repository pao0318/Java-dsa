// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/#
class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
         if(M>=N)
            return -1;
        int sum=0;
        int k=N-M+1;
        for(int i=0;i<k;i++)
            sum+=A[i];
        
       
        return sum;
        
    }
};
