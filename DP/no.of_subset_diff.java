import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner (System.in);
        int []arr={1,1,2,3};
        int dif=1;
        int n=arr.length;
        int sum=0;
        for(int key:arr)
            sum+=key;
        int target=(sum+dif)/2;
        
        
        int[][]dp=new int[n+1][target+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]]+ dp[i-1][j];
                else    
                    dp[i][j]=dp[i-1][j];
            }
        }
        
    System.out.println(dp[arr.length][target]);
        
        
    }
}
