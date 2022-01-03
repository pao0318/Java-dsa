// https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
    
        int col=matrix[0].length-1;
        int i=0;
        while(i<matrix.length &&col>=0){
            if(matrix[i][col]>target)
                col--;
            else if(matrix[i][col]==target)
                return true;
            else
                i++;
        }
        return false;
        
    }
}
