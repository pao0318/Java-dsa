// https://binarysearch.com/room/Leaning-Tower-of-Hanoi-sdG55PvBkF
import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
       Map<Integer, Integer> map = new HashMap();

        for (var num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> seen = new HashSet();
        for (var num : map.values()) {
            if (seen.contains(num)) {
                return false;
            }

            seen.add(num);
        }

        return true;
    }
}
