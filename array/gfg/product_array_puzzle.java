// https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1#
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long[] res=new long[n];
        long pro=1;
        long count=1;
        int zeros=0;
        for(int x:nums){
            if(x==0)
                zeros++;
        }
        if(zeros>1){
          Arrays.fill(res,0);
          return res;
                
        }
        else{
            for(int j=0;j<n;j++){
                if(nums[j]!=0)
                    pro*=(long)nums[j];
            }
            for(int j=0;j<n;j++){
                if(nums[j]==0)
                    res[j]=pro;
                else if(zeros==1)
                    res[j]=0;
                else    
                    res[j]=pro/nums[j];
            }
        }
        return res;
        
	} 
} 
