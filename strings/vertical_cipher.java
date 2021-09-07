import java.util.*;

class Solution {
    int i = 0, j = 0, l = 0;
    public String[] solve(String s, int k) {
        String[] str = new String[k];

        while (i < s.length() && j < s.length()) {
            if (l == 0) {
                str[j] = String.valueOf(s.charAt(i));
            } else {
                str[j] += String.valueOf(s.charAt(i));
            }
            i++;
            j++;
            if (j >= k) {
                l++;
                j = 0;
            };
        }
        return str;
    }
}
