import java.util.*;

class Solution {
    // static Map<String,Integer> map=new HashMap<>();
    public int solve(int[] prices) {
        int curr_sell=0;
        int prev_sell=0;
        int curr_buy=Integer.MIN_VALUE;
        for(int i:prices){
            int temp=curr_sell;
            curr_buy=Math.max(curr_buy,prev_sell-i);
            curr_sell=Math.max(curr_sell, curr_buy+i);
            prev_sell=temp;
        }
        return curr_sell;
    }
    
}
