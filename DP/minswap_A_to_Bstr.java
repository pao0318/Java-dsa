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
// Recursive approach
public class Solution {
    int memo[][];
    public int minDistance(String a, String b) {
        memo = new int[a.length()][b.length()];
        for (int[] row : memo) Arrays.fill(row, -1);
        return editDist(a, b, 0, 0);
    }
    
    public int editDist(String a, String b, int i, int j) {
        if (i == a.length() && j == b.length()) 
            return 0;
        if (i == a.length()) 
            return b.length() - j;

        if (j == b.length()) 
            return a.length() - i;

        if (memo[i][j] != -1)
             return memo[i][j];
        int res = Integer.MAX_VALUE;
        if (a.charAt(i) == b.charAt(j)) res = editDist(a, b, i + 1, j + 1);
        res = Math.min(res, 1 + editDist(a, b, i + 1, j + 1));
        res = Math.min(res, 1 + editDist(a, b, i + 1, j));
        res = Math.min(res, 1 + editDist(a, b, i, j + 1));
        return memo[i][j] = res;
    }
    
    
}
