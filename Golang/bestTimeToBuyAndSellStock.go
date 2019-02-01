// Solution: check each pairing of prices. set max profit to the greatest difference between the prices
// Runtime: O(n^2)

func maxProfit(prices []int) int {

    maxProfit := 0

    for i := 0; i < len(prices) -1; i++ {
        for j := i + 1; j < len(prices); j++ {

            profit := prices[j] - prices[i]

            if profit > maxProfit {
                maxProfit = profit
            }
        }
    }
    return maxProfit
}
