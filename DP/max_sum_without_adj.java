// https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1
class Solution {
    int findMaxSum(int arr[], int n) {
        
        return helper(0,0,arr,n);
    }
    public int helper(int sum, int ind, int[]arr, int n){
        if(ind>=n)
            return sum;
        
        int left= helper(sum+arr[ind],ind+2,arr,n);
        int right=helper(sum,ind+1,arr,n);
        
        return Math.max(left,right);
    }
}

// DP Memoization
class Solution {
    int findMaxSum(int a[], int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(n-1, a, dp);
    }
    int fun(int i, int[] a, int[] dp){
        if(i==0) return a[i];
        if(i<0) return 0;
        if(dp[i] != -1) return dp[i]; 
        int pick = a[i] + fun(i-2, a, dp);
        int notP = fun(i-1, a, dp); 
        return dp[i] = Math.max(pick, notP);
    }
}

// Space Optimization
class Solution {
    int findMaxSum(int arr[], int n) {
    
        int prev=arr[0];
        int prev2=0;
   
        int curr=-1;
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1)
                take+=prev2;
                
            int notake=prev; 
            curr=Math.max(take,notake);
            prev2=prev;
            prev=curr;
        }
        
        return prev;
      
    }
 
}
class Solution {
    int findMaxSum(int arr[], int n) {
        int[]dp= new int[n];
        
        dp[0]=arr[0];
        int neg=0;
        
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1)
                take+=dp[i-2];
                
            int notake=dp[i-1];
            dp[i]=Math.max(take,notake);
        }
        
        return dp[n-1];
    }
}
