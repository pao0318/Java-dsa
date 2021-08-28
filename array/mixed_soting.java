https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd// 
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int arr[] = new int[nums.length];
        for (int i : nums) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[i] = even.get(j);
                j++;
            } else {
                arr[i] = odd.get(k);
                k++;
            }
        }
        return arr;
    }
}
