class Solution {
    public int maxProfit(int[] prices) {
        
        int target = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < target) {
                target = prices[i];
            }            
            else if (prices[i] - target > max) {
                max = prices[i] - target;
            }
        }

        return max;
    }
}