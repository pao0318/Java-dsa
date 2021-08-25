
// https://binarysearch.com/room/Array-of-Sunshine-GDqXz3q7mK
import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = getValue(matrix, i, j);
            }
        }
        return result;
    }

    public int getValue(int[][] matrix, int i, int j) {
        int sum = 0;
        boolean left = i - 1 >= 0;
        boolean right = i + 1 < matrix.length;
        boolean up = j - 1 >= 0;
        boolean down = j + 1 < matrix[0].length;
        if (left) {
            sum += matrix[i - 1][j];
        }
        if (up) {
            sum += matrix[i][j - 1];
        }
        if (right) {
            sum += matrix[i + 1][j];
        }
        if (down) {
            sum += matrix[i][j + 1];
        }
        if (left && up) {
            sum += matrix[i - 1][j - 1];
        }
        if (left && down) {
            sum += matrix[i - 1][j + 1];
        }
        if (right && up) {
            sum += matrix[i + 1][j - 1];
        }
        if (right && down) {
            sum += matrix[i + 1][j + 1];
        }

        if (matrix[i][j] == 1 && 2 <= sum && sum <= 3) {
            return 1;
        }

        if (matrix[i][j] == 0 && sum == 3)
            return 1;

        return 0;
    }
}
