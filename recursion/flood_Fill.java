class Solution {
    int len=0;
    public int maxAreaOfIsland(int[][] grid) {
     int max=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    len=0;
                    dfs(grid,i,j);
                    max=Math.max(max,len);
                }
            }
        }
        return Math.max(max,0);
            
        
    }
    public void dfs(int[][]grid, int r, int c){
        if(r<0||c<0 || r>=grid.length||c>=grid[0].length||grid[r][c]==0)
            return;
        
        len++;
        grid[r][c]=0;
        
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
    }
}
