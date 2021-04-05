package array;

import java.util.*;
public class Main{
    public static void main (String args[]) throws Exception{
        Scanner sc=new Scanner (System.in);
       
        int k=sc.nextInt();
        int N=sc.nextInt();
        int [] arr=new int[N];
        
        for(int j=0;j<N;j++){
            arr[j]=sc.nextInt();
        }
        int ans = new Solution().getMinDiff(arr,N,k);
        System.out.println(ans);
    }
}

    
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg=sum/n;
        
        for(int i=0;i<n;i++){
            if (arr[i]>avg){
            arr[i]-=k;                
            }
            
            else{
            arr[i]+=k;               
            }
        }
        
         Arrays.sort(arr);
         
         int diff=arr[n-1]-arr[0];
         
         return diff;
    }
}
