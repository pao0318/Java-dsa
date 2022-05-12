// https://leetcode.com/problems/unique-paths-ii/submissions/
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        
        int[][]dp= new int[r][c];
        
         for(int i=0;i<r;i++){
            if(obstacleGrid[i][0]==1) 
                break;
             dp[i][0]=1;
         }
        
        for(int i=0;i<c;i++){
            if(obstacleGrid[0][i]==1) 
                break;
             dp[0][i]=1;
         }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(obstacleGrid[i][j]==1) 
                    continue;
                else
                 dp[i][j]=dp[i-1][j]+dp[i][j-1];
            
            }
        }
        return dp[r-1][c-1];
    }
}
