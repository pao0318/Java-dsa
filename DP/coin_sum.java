import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        int arr[]={1,2,3};
        int sum=5;
        int ans=solve(arr,sum);
        System.out.println(ans);
        }
    static int solve(int[]coin,int sum){
        int n=coin.length;
        int[][]dp=new int[n+1][sum+1];
        // Initialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0&&i>0)
                    dp[i][j]=1;
        }
        
    }
    // processing
    for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j)
                    dp[i][j]=dp[i][j-coin[i-1]]+dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
        }
        
    }
    
    return dp[n][sum];
}
}
