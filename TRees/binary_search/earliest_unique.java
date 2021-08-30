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
// Better
import java.util.*;

class EarliestUnique {
    Set<Integer> set = null;
    public EarliestUnique(int[] nums) {
        set = new LinkedHashSet<>();
        for (int ele : nums) {
            if (set.contains(ele)) {
                set.remove(ele);
            } else {
                set.add(ele);
            }
        }
    }

    public void add(int num) {
        if (set.contains(num)) {
            set.remove(num);
        } else {
            set.add(num);
        }
    }

    public int earliestUnique() {
        if (set.isEmpty())
            return -1;
        return set.iterator().next();
    }
}
