// Solution: check each pairing of prices. set max profit to the greatest difference between the prices
// Runtime: O(n^2)

class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
