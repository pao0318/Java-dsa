// https://practice.geeksforgeeks.org/problems/269f61832b146dd5e6d89b4ca18cbd2a2654ebbe/1/
class Solution{
     public int helpaterp(int[][] hospital) {
        int [][]dir={{0,1},{1,0}, {-1,0}, {0,-1}};
        Queue<Pair> pq=new LinkedList<>();
        
        for(int i=0;i<hospital.length;i++){
            for(int j=0;j<hospital[0].length;j++){
                if(hospital[i][j]==2)
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
                
                if(r>=0 && c>=0 && r<hospital.length && c<hospital[0].length && hospital[r][c]==1){
                    hospital[r][c]=2;
                    pq.add(new Pair(r,c,rem.val+1));
                }
                    
            }
        }
        
        
        
         for(int i=0;i<hospital.length;i++){
            for(int j=0;j<hospital[0].length;j++){
                if(hospital[i][j]==1)
                    return -1;
                
            }
         }
        return val;
        
    }
    
    class Pair{
        int x;
        int y;
        int val;
        Pair(int x, int y, int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }
}
