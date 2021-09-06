import java.util.*;

class Solution {
    public int solve(int N) {
        String n = N + "";
        int l = n.length();
        int[] right = new int[l];
        right[l - 1] = -1;
        int r = l - 1;

        for (int i = l - 1; i >= 0; i--) { // finding greater element  to the right of an element
            if (n.charAt(i) <= n.charAt(r)) {
                right[i] = r;
            } else {
                right[i] = -1;
                r = i;
            }
        }
        StringBuilder sb = new StringBuilder(n); // use stringbuilder for faster operations
        for (int i = 0; i < l; i++) {
            if (right[i] != -1 && n.charAt(i) != n.charAt(right[i])) {
                // swapping
                sb.setCharAt(i, n.charAt(right[i]));
                sb.setCharAt(right[i], n.charAt(i));
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
