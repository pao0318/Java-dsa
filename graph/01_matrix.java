class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> pq=new LinkedList<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)
                    pq.add(new Pair(i,j));
                else
                    mat[i][j]=-1;
            }
        }
        int directions[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(pq.size()>0){
            Pair rem=pq.poll();
            for(int i=0;i<directions.length;i++){
                int r=rem.x+directions[i][0];
                int c=rem.y+directions[i][1];
                
                if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && mat[r][c]<0){
                    pq.add(new Pair(r, c));
                    mat[r][c]=mat[rem.x][rem.y]+1;
                }
            }
        }
        return mat;
      
    }
    
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    
   
}
