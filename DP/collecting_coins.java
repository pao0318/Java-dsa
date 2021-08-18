// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int solve(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            if (i == 0)
                dp[i][0] = matrix[i][0];

            else
                dp[i][0] = matrix[i][0] + dp[i - 1][0];
        }

        for (int i = 0; i < col; i++) {
            if (i == 0)
                dp[0][i] = matrix[0][i];

            else
                dp[0][i] = matrix[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }

        return dp[row - 1][col - 1];
    }
}
