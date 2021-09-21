class Solution {
     int ans=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max1=Integer.MIN_VALUE;
       int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans=0;
                    dfs(grid,i,j);
                    max1=Math.max(max1,ans);
                }
                else
                    continue; 
            }
        }
        return Math.max(max1,0);
    }
    
    public void dfs(int[][]grid, int x,int y){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]==0)
            return;
        ans++;
       
        grid[x][y]=0;
        dfs(grid,x-1,y);
        dfs(grid,x,y-1);
        dfs(grid,x+1,y);
        dfs(grid,x,y+1);
        
    }
}
