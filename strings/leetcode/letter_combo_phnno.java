// https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/?currentPage=1&orderBy=most_votes&query=
import java.util.HashMap;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> result = new ArrayList<String>();

        if (digits.length() == 0)
            return result;

        result.add("");
        for (int i = 0; i < digits.length(); i++)
            result = combine(digitletter[digits.charAt(i) - '0'], result);

        return result;

    }

    public List<String> combine(String dig, List<String> result) {
        List<String> res = new ArrayList<String>();

        for (int i = 0; i < dig.length(); i++) {
            for (String x : result) {
                res.add(x + dig.charAt(i));
            }
        }
        return res;
    }
}
