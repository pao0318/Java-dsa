// https://leetcode.com/problems/number-of-1-bits/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) 
            return 0;
        
        return  (n & 1) + hammingWeight(n >>> 1);
    }
}
