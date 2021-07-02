import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int N = nums.length;
        if (N == 1)
            return new int[] {};
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            boolean p = (i == 0 || nums[i] > nums[i - 1]) && (i == N - 1 || nums[i] > nums[i + 1]);
            if (p)
                ans.add(i);
        }

        return convert(ans);
    }

    public int[] convert(ArrayList<Integer> arr) {
        int[] ret = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) ret[i] = arr.get(i);
        return ret;
    }
}
