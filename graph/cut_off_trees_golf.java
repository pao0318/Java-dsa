// https://leetcode.com/problems/cut-off-trees-for-golf-event/ 
class Pair{
    int x;
    int y;
    int w;
    Pair(int x,int y,int w){
        this.x=x;
        this.y=y;
        this.w=w;
    }
}

class Solution {
    int [][]dirs=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int cutOffTree(List<List<Integer>> forest) {
        int r=forest.size();
        int c=forest.get(0).size();
        
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)-> {
            if(a.w-b.w>0)
                return 1;
            else
                return -1;
        });
        int total_steps=0;
        
         for(int i = 0; i<r; i++) {
            for(int j = 0; j<c; j++) {
                if(forest.get(i).get(j)>1)
                    pq.add(new Pair(i,j,forest.get(i).get(j)));
            }
        }
        
        
        Pair start=new Pair(0,0,forest.get(0).get(0));
        
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            
            int steps=bfs(start,p,forest);
            if(steps==-1)
                return -1;
            total_steps+=steps;
            
            start.x=p.x;
            start.y=p.y;
            
        }
        return total_steps;
        
    }
        
        public int bfs(Pair start, Pair end,List<List<Integer>> forest){
            
            int r=forest.size();
            int c=forest.get(0).size();
            
            boolean [][]visited= new boolean[r][c];
            for(boolean []x:visited)
                Arrays.fill(x,false);
            
            Queue<Pair> q = new LinkedList<>();
            
            q.add(new Pair(start.x,start.y,0));
            visited[start.x][start.y]=true;
            
            while(!q.isEmpty()){
                Pair temp=q.poll();
                int i=temp.x;
                int j=temp.y;
                
                if(i==end.x && j==end.y)
                    return temp.w;
                
                
            for(int k=0;k<dirs.length;k++){
                int new_x=i+dirs[k][0];
                int new_y=j+dirs[k][1];
                
                if(new_x>=0 && new_x<r && new_y>=0 && new_y<c && forest.get(new_x).get(new_y)!=0  &&!visited[new_x][new_y]){
                    q.add(new Pair(new_x,new_y,1+temp.w));
                    visited[new_x][new_y]=true;
                }
                
            }
            
        }
            return -1;

    } 
        
    
}
