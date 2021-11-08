// https://practice.geeksforgeeks.org/problems/edit-distance3702/1
class Solution {
    public int editDistance(String s, String t) {
        
        int n=s.length();
        int m=t.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
        for(int j=0;j<m+1;j++){
            if(i==0)
                dp[i][j]=j;
            if(j==0)
                dp[i][j]=i;
        }
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
            if(s.charAt(i-1)==t.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
            else{
                dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }   
        }
        return dp[n][m];
    }
}
