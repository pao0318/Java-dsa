// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] ans = new int[C][R];
        int k = 0;
        int p = 0;
        for (int i = 0; i < R; i++) {
            k = i;
            p = 0;
            for (int j = C - 1; j >= 0; j--) {
                ans[p][k] = matrix[i][j];
                p++;
            }
        }
        return ans;
    }
}
