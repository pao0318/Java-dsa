// https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1#
class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int []dp=new int[n];
	    int sum=arr[0];
	    dp[0]=arr[0];
	    for(int i=0;i<n;i++){
	        dp[i]=arr[i];
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j]){
	                dp[i]=Math.max(dp[i], dp[j]+arr[i]);
	            }
	        }
	        sum=Math.max(sum,dp[i]);
	    }
	    return sum;
	    
	    
	}  
}
