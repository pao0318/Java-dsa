class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
      ArrayList<String> list=new ArrayList<String>();
 
    
        dfs(0,0,n,m,list,"");
        return list;
    }
    
    public static void dfs(int i,int j,int n,int m[][],ArrayList<String> list,String s){
        
        if(i<0 || j<0 || i>=n ||j>=n || m[i][j]==0) return;
        if(i==n-1 && j==n-1){
            list.add(s);
            return;
        }
            m[i][j]=0;
            dfs(i+1,j,n,m,list,s+"D");
        
            dfs(i,j-1,n,m,list,s+"L");
         
            dfs(i,j+1,n,m,list,s+"R");
      
            dfs(i-1,j,n,m,list,s+"U");
            m[i][j]=1;
       
    }
}
