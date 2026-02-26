class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0] ;
        int maxProfit = 0 ;


        for(int sell = 0; sell < prices.length ; sell++)
        {
            min_price = Math.min(min_price , prices[sell]);
            maxProfit = Math.max(maxProfit, prices[sell]-min_price);
        }
        return maxProfit ;
    }
}