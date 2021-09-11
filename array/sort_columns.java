import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        for(int j=0;j<matrix[0].length;j++){
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            for(int i=0;i<matrix.length;i++){
                pq.add(matrix[i][j]);
            }
            for(int k=0;k<matrix.length;k++){
                matrix[k][j]=pq.poll();
            }
        }
        return matrix;
    }
}
