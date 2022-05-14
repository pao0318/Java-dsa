class Solution {
    int cntr=0;
    public int closedIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j))
                        cntr++;
                }
            }
        }
        return cntr;
    }
        
        public boolean dfs(int[][]grid, int i, int j){
            if(i<0||j<0||i>=grid.length|| j>=grid[0].length)
            return false;
            if(grid[i][j]==1)
                return true;
            grid[i][j]=1;
            
            boolean a=dfs(grid,i+1,j);
            boolean b=dfs(grid,i,j+1);
            boolean c=dfs(grid,i-1,j);
            boolean d=dfs(grid,i,j-1);
            
            return a&&b&&c&&d;
        }
        
    
}
