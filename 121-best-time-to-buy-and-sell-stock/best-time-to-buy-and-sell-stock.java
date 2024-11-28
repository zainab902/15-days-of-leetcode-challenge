class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // No profit can be made
        }

        int minPrice = Integer.MAX_VALUE; // Tracks the minimum price seen so far
        int maxProfit = 0; // Tracks the maximum profit achievable

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update maximum profit
            }
        }

        return maxProfit;
    }
}
