class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {

            if (i + 1 < prices.length && prices[i] > prices[i + 1]) ans[i] = prices[i] - prices[i + 1];
            else ans[i] = prices[i];
        }

        return ans;
    }
}