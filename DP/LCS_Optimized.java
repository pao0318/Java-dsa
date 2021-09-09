import java.util.*;
public class Main{
    static int lcs(String X, String Y){
        int n=X.length();
        int m=Y.length();
        
        int[][] dp=new int[2][m+1];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=0;
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    dp[i%2][j]=0;
                else if(X.charAt(i-1)==Y.charAt(j-1))  
                    dp[i%2][j]=1+dp[(i+1)%2][j-1];
                else
                    dp[i%2][j]=Math.max(dp[i%2][j-1],dp[(i+1)%2][j]);
            }
        }
        return dp[n%2][m];
    }
    
    public static void main(String args[]) throws Exception{
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        System.out.println("Length of LCS is " +lcs(X, Y));
    }
}
