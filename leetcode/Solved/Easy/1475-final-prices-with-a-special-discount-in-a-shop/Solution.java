class Solution {
    public int[] finalPrices(int[] prices) {

        int[] ans = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {

            // 스택 top 이 현재 가격 이상이면, 현재 가격이 그 항목의 첫 할인값이 된다.
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {

                int idx = stack.pop();
                ans[idx] = prices[idx] - prices[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
