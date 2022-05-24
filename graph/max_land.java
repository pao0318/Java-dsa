class Solution {
    int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    public class Pair{
        int i,j,level;
        Pair(int i,int j,int level){
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    public int maxDistance(int[][] mat) {
        ArrayDeque<Pair> q=new ArrayDeque<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    mat[i][j]=-1;
                }else{
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int ans=-1;
        while(q.size()>0){
            Pair rem=q.remove();
            
            for(int k=0;k<4;k++){
                int ni=rem.i+dirs[k][0];
                int nj=rem.j+dirs[k][1];
                
                if(ni>=0 && ni<mat.length && nj>=0 && nj<mat[0].length && mat[ni][nj]==-1){
                    mat[ni][nj]=rem.level+1;
                    ans=Math.max(ans,rem.level+1);
                    q.add(new Pair(ni,nj,rem.level+1));
                }
            }
        }
        return ans;
    }
}
