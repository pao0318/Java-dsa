import java.util.*;

class Solution {
    public int solve(int[][] matrix) {
        int[]row=new int[matrix.length];
        int[]col=new int[matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,matrix[i][j]);
            }
            row[i]=(max);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max=Math.max(max,matrix[j][i]);
            }
            col[i]=(max);
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==matrix[i][j] && col[j]==matrix[i][j])
                    ans++;
            }
        }

    return ans;

    }
}
