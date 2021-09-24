class Solution {
    public int orangesRotting(int[][] grid) {
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        
        Queue<Pair> pq=new LinkedList<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    pq.add(new Pair(i,j,0));
            }
        }
        int val=0;
        while(pq.size()>0){
            Pair rem=pq.poll();
            for(int i=0;i<dir.length;i++){
                int r=rem.x+dir[i][0];
                int c=rem.y+dir[i][1];
                val=rem.val;
                if(r>=0&&c>=0&&r<grid.length&&c<grid[0].length&&grid[r][c]==1){
                    grid[r][c]=2;
                    pq.add(new Pair(r,c,rem.val+1));
                }
            }
            
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return val;
    }
    
    
    class Pair{
        int x;
        int y;
        int val;
        Pair(int x, int y,int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }
}
