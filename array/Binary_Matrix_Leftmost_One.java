// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

import java.util.*;

class Solution {
    public int solve(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int h = matrix[i].length;
            int ans = helper(matrix[i], 0, h);
            if (ans != -1)
                min = Math.min(ans, min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    int helper(int[] matrix1, int l, int h) {
        if (h >= l && l <= matrix1.length - 1) {
            int mid = l + (h - l) / 2;
            if (matrix1[mid] == 1 && mid != l)
                return helper(matrix1, l, mid);
            if (matrix1[mid] == 0)
                return helper(matrix1, mid + 1, h);
            else
                return mid;
        }

       return -1;
    }
}
