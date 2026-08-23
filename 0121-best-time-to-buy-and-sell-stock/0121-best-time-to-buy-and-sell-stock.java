class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Buy day
        int right = 1; // Sell day
        int maxProfit = 0;

        while (right < prices.length) {
            // Profitable transaction found
            if (prices[left] < prices[right]) {
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                // Found a cheaper buying day, move left pointer here
                left = right;
            }
            // Always move right pointer forward to explore future days
            right++;
        }

        return maxProfit;
    }
}
