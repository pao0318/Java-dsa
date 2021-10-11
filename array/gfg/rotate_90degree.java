// https://leetcode.com/problems/rotate-image/submissions/
class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=matrix[j][i];
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                matrix[i][k++]=res[i][j];
            }
            k=0;
        }
        
    }
}
