class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        int[] state = nums.clone();

        for (int operation = 0; operation < k; operation++) {

            int minIndex = 0;

            for (int i = 1; i < state.length; i++) {

                // 등호를 쓰지 않아 최솟값이 여러 개면 가장 앞을 고른다.
                if (state[i] < state[minIndex]) {
                    minIndex = i;
                }
            }

            state[minIndex] *= multiplier;
        }

        return state;
    }
}
