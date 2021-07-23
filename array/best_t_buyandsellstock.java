class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int op=0;
        int pist=0;
        int lsf=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<lsf)
                lsf=prices[i];
            pist=prices[i]-lsf;
            if(pist>op)
                op=pist;
    }
    return op;
        
    }
}
