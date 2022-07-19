// https://practice.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1
class Solution
{
    public int CountPS(String S, int N)
    {
        int n=S.length();
        boolean [][]dp=new boolean[n][n];
        
        for(boolean[]x:dp)
            Arrays.fill(x,false);
        
        
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                boolean flag=S.charAt(i)==S.charAt(j);
                if(i==j)
                    dp[i][j]=true;
                
                else if(i-j==1)
                    dp[i][j]=flag;
                
                else if(flag && dp[i-1][j+1])
                    dp[i][j]=true;
                    
            }
        }
        
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                if(i==j)
                    continue;
                if(dp[i][j])
                    cnt++;
            }
        }
        return cnt;
        
    }
}
