import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        return findKthSmallest(nums, 0, nums.length - 1, k);
    }

    int findKthSmallest(int[] nums, int l, int r, int k) {
        if (k >= 0 && k < nums.length) {
            int pivot = partition(nums, l, r);
            if (pivot == k)
                return nums[pivot];

            if (pivot > k)
                return findKthSmallest(nums, l, pivot - 1, k);
            else
                return findKthSmallest(nums, pivot + 1, r, k);
        }

        return -1;
    }

    int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l;
        int j = l;

        while (j < r) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }

            j++;
        }

        swap(nums, i, r);
        return i;
    }

    void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
