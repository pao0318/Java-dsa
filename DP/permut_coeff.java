// https://www.geeksforgeeks.org/permutation-coefficient/
import java.util.*;
public class Main{
    static int permute(int u,int v){
        int [][]dp=new int[u+1][v+1];
        for(int i=0;i<u+1;i++)
            dp[i][0]=1;
            
            
        
        for(int i=1;i<u+1;i++){
            for(int j=1;j<=Math.min(i,v);j++){
                if(j==1)
                    dp[i][j]=i;
                if(i==j)
                    dp[i][j]=1;
                else
                    dp[i][j]=(i-j+1)*dp[i][j-1];
                    
            }
        }
        return dp[u][v];
    }
    public static void main(String args[]) throws Exception{
        int x=10;
        int y=2;
        System.out.println(permute(x,y));
    }
}
