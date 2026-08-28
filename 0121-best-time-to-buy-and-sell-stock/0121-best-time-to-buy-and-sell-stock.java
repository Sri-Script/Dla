class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize min price to a very high value
        int maxProfit = 0; // Initialize max profit to 0

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update min price if a lower price is found
            }
            int profit = price - minPrice; // Calculate profit if selling today
            maxProfit = Math.max(maxProfit, profit); // Update max profit if it's higher
        }
        return maxProfit; // Return the maximum profit found
    }
}
       
    
