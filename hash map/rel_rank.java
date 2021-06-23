import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        // Map storing the ranking of each number (number --> ranking)
        Map<Integer, Integer> rankings = new HashMap<Integer, Integer>();

        // Create a copy of the input array to keep original ordering
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        // Assign rankings beginning with the largest number
        int rank = 0;
        for (int i = copy.length - 1; i >= 0; i--) {
            if (!rankings.containsKey(copy[i])) {
                rankings.put(copy[i], rank++);
            }
        }

        // Assign rankings from the rankings map
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rankings.get(nums[i]);
        }
        return nums;
    }
}
