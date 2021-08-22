// https://www.geeksforgeeks.org/friends-pairing-problem/
class Solution
{
    public long countFriendsPairings(int n) 
    { 
            
       long dp[]= new long[n+1];
       for(int i=0;i<n+1;i++){
       if(i<=2)
            dp[i]=i;
        else
            dp[i]=(dp[i-1]+(dp[i-2]*(i-1))%1000000007)%1000000007;
       }
        
        return dp[n];
    }
} 
