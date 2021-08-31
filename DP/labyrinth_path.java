mport java.util.*;

class Solution {
    public int solve(int[][] matrix) {
    int mod = 1000000007;
    int n = matrix.length;
    int m = matrix[0].length;
    int[][]vis=new int[n][m];
    vis[0][0] = 1;
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                if (i > 0) vis[i][j] += vis[i - 1][j];
                if (j > 0) vis[i][j] += vis[i][j - 1];
                vis[i][j] %= mod;
            }
        }
    }

    return vis[n - 1][m - 1];
    }
}
