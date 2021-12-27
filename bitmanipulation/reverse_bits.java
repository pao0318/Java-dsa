// https://leetcode.com/problems/reverse-bits/submissions/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int match = 1<<31;
        
        for(int i=0;i<32;i++){
            if((n&match)!=0){
                res += 1<<i;
            }
            n = n<<1;
        }
        
        return res;
    }
}
