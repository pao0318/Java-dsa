// https://www.interviewbit.com/problems/word-search-board/
public class Solution {
    int r;
    int c;
    
    int [][]dirs=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    
    public boolean isSafe(int i, int j){
        return i>=0 && i<r && j>=0 && j<c;
    }
    
    public boolean dfs(int i,int j, int index, ArrayList<String> A,String B){
        if(index==B.length()-1)
            return true;
        
        index++;
        
        for(int k=0;k<dirs.length;k++){
            int n_x=i+dirs[k][0];
            int n_y=j+dirs[k][1];
            
            if(isSafe(n_x,n_y) && A.get(n_x).charAt(n_y)==B.charAt(index)){
                if(dfs(n_x,n_y,index,A,B))
                    return true;
            }
        }
        return false;
        
    }
    
    
    
    public int exist(ArrayList<String> A, String B) {
        if(B=="")
            return 1;
        
        r=A.size();
        c=A.get(0).length();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(A.get(i).charAt(j)==B.charAt(0))
                    if(dfs(i,j,0,A,B))
                        return 1;
            }
        }
        return 0;
        
    }
}
