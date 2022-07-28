// https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1#
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        int arr[]={10,22,9,33,21,50,41,60,80,1};
        System.out.println(findLis(arr));
    }
    static int findLis(int []arr){
        
        int []dp=new int[arr.length];
        dp[0]=1;
        int overallmax=0;
        for(int i=1;i<dp.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>max)
                        max=dp[j];
                }
            }
            dp[i]=max+1;
            if(dp[i]>overallmax)
                overallmax=dp[i];
        }
        
        return overallmax;
    }
}

// NLOGN


import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int[] sequence = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = findInsertionIndex(sequence, num, len-1);
            sequence[i] = num;
            if (i == len) len++;
        }
        return len;
    }

    private static int findInsertionIndex(int[] array, int target, int high) {
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] >= target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
   
