class Solution {
    int count1=0;
    int count2=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res=0;
        
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j]==1 && grid2[i][j]==1){
                    dfs(grid1,grid2,i,j);
                    if(count1==count2)
                        res++;
                    
                    count1=0;
                    count2=0;
                }
                
                
            }
        }
        return res;
        
    }
    
    public void dfs(int[][]grid1, int[][]grid2, int i, int j){
        if(i<0 || j<0 || i>=grid1.length||j>=grid1[0].length || grid2[i][j]!=1)
            return;
        
        if(grid2[i][j]==1)
            count2++;
        if(grid1[i][j]==1 && grid2[i][j]==1)
            count1++;
        
        grid2[i][j]=-1;
        dfs(grid1,grid2,i+1,j);
        dfs(grid1,grid2,i-1,j);
        dfs(grid1,grid2,i,j+1);
        dfs(grid1,grid2,i,j-1);
        
        
    }
}
