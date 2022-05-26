class Solution {
    int[][] dirs= new int[][]{{1,0},{-1,0},{1,1},{-1,-1},{0,1},{0,-1},{-1,1},{1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        boolean[][]visited= new boolean[r][c];
        Queue<Pair> pq= new LinkedList<>();
        
        if(grid[0][0]==0)
            pq.offer(new Pair(0,0,1));
        
        int res=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            Pair rem=pq.poll();
            int x1=rem.x;
            int y1=rem.y;
            int dist1=rem.dist;
            
            if(x1==r-1 &&y1==c-1){
                res=Math.min(res,dist1);
                continue;
            }
            for(int []dir:dirs){
                int dx=x1+dir[0];
                int dy=y1+dir[1];
                
                if(dx>=0&& dx<r&&dy>=0&&dy<c&&!visited[dx][dy]&&grid[dx][dy]==0){
                    visited[dx][dy]=true;
                    pq.add(new Pair(dx,dy,dist1+1));
                    
                }
                
            }
        }
        return res==Integer.MAX_VALUE? -1:res;
        
    }
    
    
    
    class Pair{
        int x;
        int y;
        int dist;
        Pair(int x, int y, int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
}
