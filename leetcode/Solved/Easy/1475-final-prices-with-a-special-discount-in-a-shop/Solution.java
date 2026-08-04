class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {

            int discount = 0;
            int price = prices[i];

            for (int j = i + 1; j < prices.length; j++) {

                if (price >= prices[j]) {
                    discount = prices[j];
                    break;
                }
            }

            ans[i] = price - discount;
        }

        return ans;
    }
}