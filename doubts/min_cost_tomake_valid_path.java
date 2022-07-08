// https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public int minCost(int[][] grid) {
        
        int r=grid.length;
        int c=grid[0].length;
      
        int [][]cost= new int[r][c];
        
        for(int[]x:cost)
            Arrays.fill(x,Integer.MAX_VALUE);
        
        cost[0][0]=0;
        Deque<Pair> dq= new ArrayDeque<Pair>();
        dq.add(new Pair(0,0));
        
        while(!dq.isEmpty()){
        Pair p=dq.poll();
            int i=p.x;
            int j=p.y;
            int free_dir=grid[i][j]-1;
            
            for(int k=0;k<dirs.length;k++){
                int new_x=i+dirs[k][0];
                int new_y=j+dirs[k][1];
                
                if(new_x<0|| new_x>=r || new_y<0 || new_y>=c)
                    continue;
                
                if(i==free_dir && cost[new_x][new_y]>cost[i][j]){
                    cost[new_x][new_y]=cost[i][j];
                    dq.addFirst(new Pair(new_x,new_y));
                }
                else if(cost[new_x][new_y] >( 1+cost[i][j])){
                    cost[new_x][new_y]=1+cost[i][j];
                    dq.addLast(new Pair(new_x,new_y));
                }
            
            }
            System.out.print(cost[i][j]+" ");
        }
        
        return cost[r-1][c-1];
        
        
    }
}
