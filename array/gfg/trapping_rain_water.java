// https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int l=0;
        int r=n-1;
        int leftmax=arr[0];
        int rightmax=arr[n-1];
        
        long res=0;
        while(l<r){
            if(leftmax<rightmax){
                l=l+1;
                leftmax=Math.max(leftmax,arr[l]);
                res=res+leftmax-arr[l];
            }
            else{
                r=r-1;
                rightmax=Math.max(rightmax,arr[r]);
                res=res+rightmax-arr[r];
            }
            
        }
        
        return res;
        
    } 
}
