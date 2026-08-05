class Solution {
    public int[] finalPrices(int[] prices) {

        int[] answer = prices.clone();

        // 아직 할인 대상을 못 찾은 인덱스를 단조 스택에 쌓아 한 번의 순회로 처리한다.
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {

                int idx = stack.pop();
                answer[idx] = prices[idx] - prices[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
