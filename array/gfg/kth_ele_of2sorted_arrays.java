//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1# 

import java.util.*;

public class Main
{
    public static int kth(int[]arr1, int []arr2, int m, int n,int k){
        
        
        if(k>(m+n) || k<1)
            return -1;
            
        if(m>n)
            return kth(arr2,arr1,n,m,k);
            
        if(m==0)
            return arr2[k-1];
        
        
        if(k==1)
            return Math.min(arr1[0],arr2[0]);
        
        int i=Math.min(m,k/2);
        int j=Math.min(n,k/2);
        
        
        if(arr1[i-1]>arr2[j-1]){
            int []temp= Arrays.copyOfRange(arr2,j,n);
            return kth(arr1,temp,m,n-j,k-j);
        }
        
        int[]temp=Arrays.copyOfRange(arr1,i,m);
        
        return kth(temp,arr2,m-i,n,k-i);
        
  
    }
    
    

	public static void main(String[] args) {
		int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int m = arr1.length;
        int n = arr2.length;
 
        int k = 5;
        int ans = kth(arr1, arr2, m, n, k);
        if (ans == -1)
            System.out.println("Invalid query");
        else
            System.out.println(ans);
	}
}

// Another solution
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
