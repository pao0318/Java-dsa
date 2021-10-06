
// https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1#

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    int maxele=0;
	    
	    for(int i=0;i<N;i++){
	        if(arr[i]>maxele)
	            maxele=arr[i];
	    }
	    
	   int[] temp=new int[maxele+1];
	   Arrays.fill(temp,0);
	   
	   for(int i=0;i<N;i++){
	       temp[arr[i]]=arr[i];
	   }
	   
	   int curr_len=1;
	   int max_len=0;
	   for(int i=0;i<temp.length-1;i++){
	       if(temp[i]!=0 && temp[i+1]!=0 && temp[i]!=temp[i+1])
	            curr_len++;
	       else{
	           curr_len=1;
	       }     
	       max_len=Math.max(max_len,curr_len);     
	   }
	   return max_len;
	}
}
