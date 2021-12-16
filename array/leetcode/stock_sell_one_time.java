// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
class Solution {
    public int maxProfit(int[] prices) {
        int cost_price=prices[0];
        int profit=0;
        
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]>cost_price){
                profit=Math.max(profit,prices[i]-cost_price);
            }
            else{
                cost_price=Math.min(cost_price, prices[i]);
            }
        }
            return profit;
    }
}
