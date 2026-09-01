class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        Map<Integer, Integer> countByValue = new HashMap<>();

        for (int num : nums) {
            countByValue.merge(num, 1, Integer::sum);
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : countByValue.entrySet()) {

            int count = entry.getValue();

            if (count % k == 0) {
                sum += entry.getKey() * count;
            }
        }

        return sum;
    }
}
