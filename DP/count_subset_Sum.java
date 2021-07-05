import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,6,8,10};
        int k=10;
        int ans=solve(arr,k);
        System.out.println(ans);
        
    }
    public static int solve(int[]arr,int k){
        int [][]dp=new int[arr.length+1][k+1];
        
        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<k+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }
        
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<k+1;j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                else    
                    dp[i][j]=dp[i-1][j];
                
            }
        }
        return dp[arr.length][k];
    }
}
