class Solution {
    public String solve(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        char prev = s.charAt(0);
        res.append(prev);
        for (int i = 1; i < n; i++) {
            char current = s.charAt(i);
            if (current != prev) {
                res.append(current);
                prev = current;
            }
        }

        return res.toString();
    }
}
