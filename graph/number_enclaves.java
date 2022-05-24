class Solution {
    public int numEnclaves(int[][] grid) {
            int count = 0;
   
      int r = grid.length;
      int c = grid[0].length;
      boolean[][] visited = new boolean[r][c];
      
      for(int i=0;i<c;i++){
            if(grid[0][i]==1 && visited[0][i]==false){
                dfs(grid,visited,0,i);
            }
        }
        for(int i=0;i<r;i++){
            if(grid[i][0]==1 &&  visited[i][0]==false ){
                dfs(grid,visited,i,0);
            }
        }
        for(int i=0;i<r;i++){
            if(grid[i][c-1]==1 &&  visited[i][c-1]==false){
                dfs(grid,visited,i,c-1);
            }
        }
        for(int i=0;i<c;i++){
            if(grid[r-1][i]==1 &&  visited[r-1][i]==false){
                dfs(grid,visited,r-1,i);
            }
        }
           for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                    count++;
                }
            }
        }
        return count;
     
    }
  
   public void dfs(int[][] grid, boolean[][] visited, int r, int c){
 
       if(r>=grid.length||r<0|c>=grid[0].length||c<0)return;
       if(visited[r][c]==true || grid[r][c]==0)return;
       visited[r][c]=true;
       dfs(grid, visited, r-1, c);
       dfs(grid, visited, r+1, c);
       dfs(grid, visited, r, c-1);
       dfs(grid, visited, r, c+1);
        
    }
}
