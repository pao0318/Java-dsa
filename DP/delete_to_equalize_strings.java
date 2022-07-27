/https://binarysearch.com/room/Is-Is-7sdOdcpfZ7/ 
import java.util.*;

class Solution {
    public int solve(String a, String b) {

        int n=a.length();
        int m=b.length();
       int[][]dp= new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++)
                dp[i][j]=0;
        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
    }
    return n+m-2*dp[n][m];
}
}
