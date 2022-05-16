class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int sx=KnightPos[0]-1, sy=KnightPos[1]-1, dx=TargetPos[0]-1, dy=TargetPos[1]-1;
        
        int[][]dp= new int[N][N];
        
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[sx][sy]=0;
        
        int [][]dir= new int [][] {{-2,-1},{-2,1}, {-1,-2},{-1,2},
            {1,2},{1,-2}, {2,1},{2,-1}
        };
        
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.step-b.step);
        pq.add(new Pair(sx,sy,0));
        
        while(!pq.isEmpty()){
            Pair temp=pq.poll();
            int px=temp.x;
            int py=temp.y;
            for(int []d: dir ){
                int nx=d[0]+px;
                int ny=d[1]+py;
                
                if(nx>=0 && ny>=0 && nx<N && ny<N){
                    if(dp[nx][ny]>(dp[px][py]+1)){
                        dp[nx][ny]=dp[px][py]+1;
                        pq.add(new Pair(nx,ny,dp[nx][ny]));
                    }
                }
            }
        }
        
        return dp[dx][dy];
        
       
       
    }
}

class Pair{
    int x;
    int y;
    int step;
    public Pair(int x, int y, int step){
        this.x=x;
        this.y=y;
        this.step=step;
    }
}
