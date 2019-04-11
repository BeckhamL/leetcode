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

// Solution: Keep track of the minimum price and check the difference for values greater
// Runtime: O(n)

public class Solution {
    public int maxProfit(int prices[]) {
        
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
