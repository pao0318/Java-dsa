// https://www.interviewbit.com/problems/edit-distance/
public class Solution {
    public int minDistance(String A, String B) {
        int m=A.length();
        int n=B.length();
        
        int t[][]=new int[m+1][n+1];
        int i,j;
        for(i=0;i<m+1;i++){
            t[i][0]=i;
        }
        for(i=0;i<n+1;i++){
            t[0][i]=i;
        }
        
        for(i=1;i<m+1;i++){
            for(j=1;j<n+1;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    t[i][j]=t[i-1][j-1];
                }
                else{
                    t[i][j]=1+Math.min(t[i-1][j],Math.min(t[i][j-1],t[i-1][j-1]));
                }
            }
        }
        
  
        
        return t[m][n];
    }
}
