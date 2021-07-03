import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0][0];
        int length = matrix[0].length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
