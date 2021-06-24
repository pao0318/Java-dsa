import java.util.*;
class Solution {
    public int[] solve(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            if (map.containsKey(nums[i]))
                map.put(nums[i], i);
            else
                map.put(nums[i], -1);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) != i)
                list.add(nums[i]);
        }

        int m = list.size();
        int res[] = new int[m];
        for (int i = 0; i < m; i++) res[i] = list.get(i);
        return res;
    }
}
