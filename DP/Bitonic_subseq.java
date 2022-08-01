// https://www.interviewbit.com/problems/length-of-longest-subsequence/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
    
        int n=A.size();
        int[]arr= new int[n];
        
         for(int i=0;i<n;i++)
            arr[i]=A.get(i);
            
        int[]lis= new int[n];
        int[]lds= new int[n];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);
       
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    if(lis[j]>max)
                        max=lis[j];
                }
            }
            lis[i]=max+1;
        }
        
        for(int i=n-2;i>=0;i--){
            int max=0;
            for(int j=n-1;j>i;j--){
                if(arr[i]>arr[j]){
                    if(lds[j]>max)
                        max=lds[j];
                }
            }
            lds[i]=max+1;
        }
        
        int overallmax=0;
        for(int i=0;i<n;i++){
            if(lis[i]+lds[i]-1>overallmax)
                overallmax=lis[i]+lds[i]-1;
        }
        return overallmax;
    }
}
