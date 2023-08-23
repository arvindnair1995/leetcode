public class Best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int val = prices[0], ans = 0;
        for (int i = 1; i < prices.length; i++) {
            ans = Math.max(ans, prices[i] - val);
            val = Math.min(val, prices[i]);
        }
        return ans;
    }
}
