// https://leetcode.com/problems/valid-sudoku/submissions/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashMap<Character,Integer>[] rowmap=new HashMap[9];
        HashMap<Character,Integer>[] colmap=new HashMap[9];
        HashMap<Character,Integer>[] boxmap=new HashMap[9];
        
        for(int i=0;i<board.length;i++){
            rowmap[i]=new HashMap<>();
            colmap[i]=new HashMap<>();
            boxmap[i]=new HashMap<>();
            
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char ch= board[i][j];
                if(ch!='.'){
                    rowmap[i].put(ch,rowmap[i].getOrDefault(ch,0)+1);
                    colmap[j].put(ch,colmap[j].getOrDefault(ch,0)+1);
                    
                    int bi=(i/3)*3+(j/3);
                    boxmap[bi].put(ch, boxmap[bi].getOrDefault(ch,0)+1);
                    
                    if(boxmap[bi].get(ch)>1|| rowmap[i].get(ch)>1||colmap[j].get(ch)>1)
                        return false;
                    
                }
            }
        }
        return true;
        
    }
}
