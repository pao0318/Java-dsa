// https://www.interviewbit.com/problems/capture-regions-on-board/ 
public class Solution {
    int r;
    int c;
	public void solve(ArrayList<ArrayList<Character>> a) {
        r=a.size();
        c=a.get(0).size();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0 || i==r-1||j==c-1){
                    if(a.get(i).get(j)=='O')
                        dfs(i,j,a);
            }
        }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a.get(i).get(j)=='T')
                    a.get(i).set(j,'O');
                else if(a.get(i).get(j)=='O')
                    a.get(i).set(j,'X');
            }
        }
        
        return;
        
    }
    public void dfs(int i,int j,ArrayList<ArrayList<Character>> a){
        if(i<0 || i>=r ||j<0 ||j>=c ||a.get(i).get(j)=='X' ||a.get(i).get(j)=='T')
            return;
        
        a.get(i).set(j,'T');
        
        dfs(i+1,j,a);
        dfs(i,j+1,a);
        dfs(i,j-1,a);
        dfs(i-1,j,a);
        return;
   
    }
}
