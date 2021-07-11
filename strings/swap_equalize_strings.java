import java.util.*;

class Solution {
    public boolean solve(String s, String t) {
        if (s.length() != t.length())
            return false;
        String sol = s + t;
        char[] solu = sol.toCharArray();
        Arrays.sort(solu);
        int count = 1;
        for (int i = 1; i < solu.length; i++) {
            if (solu[i] == solu[i - 1]) {
                count++;
            } else {
                if (count % 2 == 1) {
                    return false;
                }
                count = 1;
            }
        }
        return true;
    }
}
