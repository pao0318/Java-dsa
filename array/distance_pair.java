
// https://binarysearch.com/problems/Distance-Pair
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int mx = nums[0] + 0;
        int res = Integer.MIN_VALUE;
        for (int j = 1; j < nums.length; j++) {
            res = Math.max(res, nums[j] - j + mx);
            mx = Math.max(mx, nums[j] + j);
        }
        return res;
    }
}
