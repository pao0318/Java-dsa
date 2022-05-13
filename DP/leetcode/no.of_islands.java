// https://leetcode.com/problems/number-of-islands/
class Solution {
   int counter=0;
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][]vis= new boolean[r][c];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]!=true && grid[i][j]=='1'){
                    counter++;
                    dfs(grid, i, j,vis);
                }
            }
            
        }
        return counter;
    }
        public void dfs(char[][]grid, int i, int j,  boolean[][]vis){
            if(i<0 || j<0 || i>=grid.length||j>=grid[0].length||vis[i][j]==true||grid[i][j]=='0')
                return;
            
            vis[i][j]=true;
            dfs(grid,i+1,j,vis);
            dfs(grid,i-1,j,vis);
            dfs(grid,i,j+1,vis);
            dfs(grid,i,j-1,vis);
            
        
    }
}
