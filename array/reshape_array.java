class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int pro=(mat.length)*(mat[0].length);
        int [][]res=new int[r][c];
        if(r*c!=pro)
            return mat;
        int l=0;
        int k=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(k<c)
                    res[l][k++]=mat[i][j];
                else{
                    k=0;
                    l++;
                    res[l][k++]=mat[i][j];
                }
            }
        }
     
        return res;
   
    }
}
// OR
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int pro=(mat.length)*(mat[0].length);
        int n=mat.length;
        int m=mat[0].length;
        int [][]res=new int[r][c];
        
        if(r*c!=pro)
            return mat;
        int l=0;
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++,k++){
                res[i][j]=mat[k/m][k%m];
            }
        }
       
        return res;
        
    }
}
