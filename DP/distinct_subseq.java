// https://www.interviewbit.com/problems/distinct-subsequences/
public class Solution {
    public int numDistinct(String A, String B) {
        int n=A.length();
        int m=B.length();
        if(n<m)
        return 0;
        int a[][]=new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            a[i][0]=0;
        }
        for(int j=0;j<n+1;j++){
            a[0][j]=1;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                
                if(B.charAt(i-1)!=A.charAt(j-1)){
                    a[i][j]=a[i][j-1];
                }
                else{
                    a[i][j]=a[i][j-1]+a[i-1][j-1];
                }
            }
        }
        
        return a[m][n];
    }
}
