// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        // reversing rows
        for(int[]row:matrix)
            reverse(row);
        
        // Transposing the matrix;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;
        
    }

    public void reverse(int[]row){
        int start=0;
        int end=row.length-1;

        while(start<end){
            int temp=row[start];
            row[start]=row[end];
            row[end]=temp;
            start++;
            end--;
        }
    }
}

// OR with O(n^2) space Complexity
import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = matrix[j][m - i - 1];
            }
        }
        return res;
    }
}
