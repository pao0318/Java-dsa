import java.util.*;

class EarliestUnique {
    private Map<Integer, Integer> map;
    public EarliestUnique(int[] nums) {
        map = new LinkedHashMap();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
    }

    public void add(int num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    public int earliestUnique() {
        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }
}
