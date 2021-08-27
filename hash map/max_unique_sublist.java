import java.util.*;

class Solution {
    public int solve(int[] nums) {
     int i = 0;
	int j = 1;
	HashSet<Integer> s = new HashSet<>();
	s.add(nums[0]);
	
	int sum = nums[0];
	int maxSum = sum;

	while (i < nums.length - 1 && j < nums.length) {

		if(!s.contains(nums[j])) {
			sum += nums[j];
			maxSum = Math.max(maxSum, sum);
			s.add(nums[j++]);
		}
		else {
			sum -= nums[i];
			s.remove(nums[i++]);
		}
	}

	return maxSum;
    }
}
