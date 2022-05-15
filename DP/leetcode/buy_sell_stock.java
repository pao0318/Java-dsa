class Solution {
    public int maxProfit(int[] prices) {
        int cost_price=prices[0];
        int profit=0;
        
        for(int i=1;i<prices.length;i++){
            
             cost_price=Math.min(cost_price, prices[i]);
            profit=Math.max(profit, prices[i]-cost_price);
        }
        
        return profit;
    }
}
