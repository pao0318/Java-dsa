// https://practice.geeksforgeeks.org/problems/edit-distance3702/1
public class Solution {
    public int minDistance(String A, String B) {
        int n=A.length();
        int m=B.length();
        
        int[][]dp= new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++)
            dp[i][0]=i;
        
        for(int i=0;i<m+1;i++)
            dp[0][i]=i;
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(A.charAt(i-1)==B.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                
            }
        }
        return dp[n][m];
    }
}

