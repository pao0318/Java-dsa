// https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/#
class Solution
{
    public static String reduced_String(int k, String s)
    {
        
        if(k==1)
            return "";

        StringBuilder res=new StringBuilder(s);
        int[] dp=new int[s.length()];
        for(int i=0;i<res.length();i++){
            if(i==0 || res.charAt(i)!=res.charAt(i-1))
                dp[i]=1;
            else{
                dp[i]=1+dp[i-1];
                if(dp[i]==k){
                    res.delete(i-k+1,i+1);
                    i=i-k;
                }
            }    
        }
        
        return res.toString();
        
    }
}
