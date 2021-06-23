import java.util.*;

class Solution {
    public int[] solve(String s, String c) {
        int[] re = new int[s.length()];
        int min = Integer.MAX_VALUE;
        int prev = s.indexOf(c), next = s.indexOf(c, prev + 1);
        for (int i = 0; i < re.length; i++) {
            if (next >= 0) {
                if (i > next) {
                    prev = next;
                    next = s.indexOf(c, prev + 1);
                }
                re[i] = Math.min(Math.abs(i - prev), Math.abs(i - next));
            } else {
                re[i] = Math.abs(i - prev);
            }
        }
        return re;
    }
}
