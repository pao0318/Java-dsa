// https://leetcode.com/problems/n-queens/ 
class Solution {
   
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        boolean[][] chess = new boolean[n][n];
        helper(ans,chess,0);
        return ans;
 
    }
    public void helper(List<List<String>> ans, boolean[][] chess, int row){
        
        if(row==chess.length){
            add(ans,chess);
            return;
        }
        
        for(int i=0;i<chess[0].length;i++){
            if(isSafe(row,i,chess)){
                chess[row][i]=true;
                helper(ans,chess,row+1);
                chess[row][i]=false;
            }
        }
    }
    
    
    public boolean isSafe(int x, int y,boolean[][]chess){
       //column
        for(int i = x; i >=0; i--){
            if(chess[i][y]){
                return false;
            }
        }
        //left diagnol
        int moves = Math.min(x,y);
        for(int i = 1; i <= moves; i++){
            if(chess[x-i][y-i]){
                return false;
            }
        }
        //right diagnol
        moves = Math.min(x,chess[0].length - y - 1);
        for(int i = 1; i <= moves; i++){
            if(chess[x-i][y+i]){
                return false;
            }
        }
        return true; 
        
    }
    
      public void add(List<List<String>> ans, boolean[][] chess){
        List<String> posAns = new ArrayList<>();
        String s = "";
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                if(chess[i][j]){
                    s+="Q";
                }
                else{
                    s+=".";
                }
            }
            posAns.add(s);
            s="";
        }
        ans.add(posAns);
        return;
    }
    
    
    
}
