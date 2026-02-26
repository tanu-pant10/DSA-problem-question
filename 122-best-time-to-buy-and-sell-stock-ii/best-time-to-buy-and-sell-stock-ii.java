class Solution {
    public int maxProfit(int[] prices) {
        int TotalProfit = 0 ; 
        for(int sell = 1 ; sell < prices.length ; sell++)
        {
            if (prices[sell] > prices[sell -1 ])
            {
             TotalProfit  += prices[sell] - prices[sell -1];
            }
        }
        return TotalProfit ;
    }
}