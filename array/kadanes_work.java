class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        int overs=arr[0];
        int currs=arr[0];
        for(int i=1;i<n;i++){
            if(currs>0)
                currs+=arr[i];
            else
                currs=arr[i];
        
        if(currs>overs)
            overs=currs;
        }
            return overs;        
    }
    
}
