// https://leetcode.com/problems/rotting-oranges/submissions/
class Pair{
    int x;
    int y;
    int w;
    Pair(int x,int y, int w){
        this.x=x;
        this.y=y;
        this.w=w;
    }
}

class Solution {
    int [][]dirs= new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        
        int r=grid.length;
        int c=grid[0].length;
        Queue<Pair>pq= new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2)
                    pq.add(new Pair(i,j,0));
                
            }
        }
        int val=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            for(int k=0;k<dirs.length;k++){
                int new_x=p.x+dirs[k][0];
                int new_y=p.y+dirs[k][1];
                val=p.w;
                
                if(new_x<0 || new_x>=r||new_y<0 || new_y>=c ||grid[new_x][new_y]==0 || grid[new_x][new_y]==2)
                    continue;
                
                grid[new_x][new_y]=2;
                pq.add(new Pair(new_x,new_y,val+1));
            }
        }
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1)
                 return -1;
            }
        }
        
        return val;
        
    }
}

