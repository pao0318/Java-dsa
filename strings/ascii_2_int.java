import java.util.*;

class Solution {
    public int solve(String s) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}
