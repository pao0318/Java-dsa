// 
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int r=0;
        int c=0;
    
        String ele;
        ArrayList<String>list=new ArrayList<>();
        if(m[0][0]==1){
            ele="";
            path(list,m,n,r,c,ele);
        }
        Collections.sort(list);
        return list;
        
    }
    public static void path(ArrayList<String>list, int[][]m, int n, int r, int c,String ele){
        if(r<0||c<0||r>=n||c>=n||m[r][c]==0)
            return;
            
        if(r==n-1&&c==n-1){
            list.add(ele);
            return;
        }
        m[r][c]=0;
        path(list,m,n,r+1,c,ele+"D");    
        path(list,m,n,r-1,c,ele+"U"); 
        path(list,m,n,r,c-1,ele+"L"); 
        path(list,m,n,r,c+1,ele+"R"); 
        m[r][c]=1;
    }
}
