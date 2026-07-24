class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxProfit = 0, profit = 0;
        int l = 0, r = 1;
        while(r < prices.length){
            if(prices[l] < prices[r]){
               profit = prices[r] - prices[l];
               maxProfit = Math.max(maxProfit, profit);
            } else{
                l = r;
            }
            r++;

        }
        return maxProfit;
    }
}
