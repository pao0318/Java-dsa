//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1# 
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0;
        int j=0;
        int index=0;
        k--;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(index==k)
                    return arr1[i];
                else{
                    index++;
                    i++;
                }    
            }
            else{
                if(index==k)
                    return arr2[j];
                else{
                    index++;
                    j++;
                }    
            }
            
        }
        if(i<n && j>=m){
            return arr1[i+k-index];
        }
        
            return arr2[j+k-index];
        
        
    }
}
