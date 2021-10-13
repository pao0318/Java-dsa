// https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
class Solution {
    // Function to find the number of islands.
     
    public int numIslands(char[][] grid) {
       int count=0;
        boolean [][]vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    bfs(grid,i,j,vis);
                    count++;
                }
            }
        }
        return count;
    }
      boolean isSafe(char[][] grid,int i,int j,boolean[][] vis) {
        int u=grid.length;
        int v=grid[0].length;
        return ((i>=0 && i<u) && (j>=0 && j<v) && (vis[i][j]==false) && (grid[i][j]=='1'));
    }
    
    public void bfs(char[][] grid,int i,int j,boolean[][] vis) {
        vis[i][j]=true;
        int[] row={-1,-1,-1,0,0,1,1,1};
        int[] col={-1,0,1,-1,1,-1,0,1};
        for(int k=0;k<8;k++) {
            if(isSafe(grid,i+row[k],j+col[k],vis)) {
                bfs(grid,i+row[k],j+col[k],vis);
            }
        }
    }
    
}
