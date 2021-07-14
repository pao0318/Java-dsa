import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
//       Taking second string to be reverse of 1st string
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        s2.toString();
        int n=s1.length();
        int m=s2.length();
        int[][]dp=new int[n+1][m+1];
        int ans=solve(s1,s2,n,m,dp);
        System.out.println(ans);
    }
    static int solve(String X, StringBuilder Y,int n,int m,int[][]arr){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    arr[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(X.charAt(i-1)==Y.charAt(j-1))
                    arr[i][j]=1+arr[i-1][j-1];
                
                else    
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                
            }
        }
        return n-arr[n][m];
        
        
    }
}
