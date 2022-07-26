// https://www.interviewbit.com/problems/distinct-subsequences/

// Recursion
public class Solution {
    public int numDistinct(String A, String B) {
        int n=A.length();
        int m=B.length();
        
        return recur(A,B,n-1,m-1);
    }
    public int recur(String A, String B, int i, int j){
        if(i<0)
            return 0;
        if(j<0)
            return 1;
        if(A.charAt(i)==B.charAt(j))
            return recur(A,B,i-1,j-1)+recur(A,B,i-1,j);
        else
            return recur(A,B,i-1,j);
    }
}

// DP
public class Solution {
    public int numDistinct(String A, String B) {
        int N = A.length();
        int M = B.length();
        int [][] dp =new int[N+1][M+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=M;j++){
                dp[i][j]= 0;
            }
        }//init dp
        for(int j=1;j<=M;j++){
            dp[0][j] =0;
        }//base case
        for(int i=0;i<=N;i++){
            dp[i][0] =1;
        }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(A.charAt(i-1) == B.charAt(j-1)){//IF Match
                    dp[i][j] =  dp[i-1][j-1] + dp[i-1][j];//take + notTake
                }else{
                    dp[i][j] = dp[i-1][j];//Not Match
                }
            }
        }//for closes

        return dp[N][M];
    }   
}
   
// Space Optimized
// TWO ARRAYS
class Solution {
    public int numDistinct(String s, String t) {
        int N = s.length();
        int M = t.length();
        int [] prev = new int[M+1];
        int [] cur  = new int[M+1];
        Arrays.fill(prev,0);
        Arrays.fill(cur,0);
        cur[0]=1;
        prev[0]=1;
           for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){//IF Match
                    cur[j] =  prev[j-1] + prev[j];//take + notTake
                }else{
                    cur[j] = prev[j];//Not Match
                }
            } 
               for(int in=0;in<=M;in++){
                   prev[in]=cur[in];
               }
           }
        return prev[M];
    }   
}

// 1 ARRAY
public class Solution {
    public int numDistinct(String A, String B) {
        int N = A.length();
        int M = B.length();
        double [] prev = new double[M+1];
     
        Arrays.fill(prev,0);
        
        prev[0]=1;
           for(int i=1;i<=N;i++){
            for(int j=M;j>=1;j--){
                if(A.charAt(i-1) == B.charAt(j-1))//IF Match
                    prev[j] =  prev[j-1] + prev[j];//take + notTake
                
            } 
           }
        return (int)prev[M];
    }   
}
