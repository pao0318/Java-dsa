// https://leetcode.com/problems/zigzag-conversion/
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuffer sb = new StringBuffer();
        int traversal = (2 * (numRows - 1));
        int counter = traversal;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += traversal) {
                sb.append(s.charAt(j));
                if ((j + counter) < s.length() && (i != 0 && i != numRows - 1))
                    sb.append(s.charAt(j + counter));
            }
            counter -= 2;
        }
        return sb.toString();

    }
}
