import java.util.*;

class Solution {
    public String solve(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] c = s.toCharArray();
        char[] c1 = s.toCharArray();
        Arrays.sort(c);
        int n = c1.length;
        int j = 0;
        int k = 0;
        while (j < n && k < n && c1[j] == c[k]) {
            j++;
            k++;
        }
        if (j == n) {
            return s;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (c1[i] == c[k]) {
                char temp = c1[i];
                c1[i] = c1[j];
                c1[j] = temp;
                break;
            }
        }
        return String.valueOf(c1);
    }
}
