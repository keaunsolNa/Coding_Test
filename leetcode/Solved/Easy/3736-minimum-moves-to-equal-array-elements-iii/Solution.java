class Solution {
    public int minMoves(int[] nums) {
        
        Integer[] result = Arrays.stream(nums)
                                 .boxed()
                                 .toArray(Integer[]::new);
        
        Arrays.sort(result, Collections.reverseOrder());

        int max = result[0];
        int ans = 0;

        for (int i = 1; i < result.length; i++) {
            ans += max - result[i];
        }

        return ans;
    }
}