// https://practice.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1?page=1&curated[]=1&sortBy=submissions
class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        int sum1=0,sum2=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++) sum1+=A[i];
        for(int i=0;i<m;i++) sum2+=B[i];
       
    if((sum1-sum2)%2!=0)
        return -1;
    
    int target=(sum1-sum2)/2;
     int i=0;
     int j=0;
     Arrays.sort(A);
     Arrays.sort(B);
     
     while(i<n && j<m){
         int diff=(int)(A[i]-B[j]);
         if(diff==target)
            return 1;
        else if(diff<target)
            i++;
        else
            j++;
     }
      return -1;
        
        
    }
}
