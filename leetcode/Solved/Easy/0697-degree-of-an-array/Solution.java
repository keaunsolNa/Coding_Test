class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> firstIndexes = new HashMap<>();
        Map<Integer, Integer> lastIndexes = new HashMap<>();
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {

            firstIndexes.putIfAbsent(nums[i], i);
            lastIndexes.put(nums[i], i);
            degree = Math.max(degree, counts.merge(nums[i], 1, Integer::sum));
        }

        int shortest = nums.length;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {

            if (entry.getValue() == degree) {

                int value = entry.getKey();
                shortest = Math.min(shortest, lastIndexes.get(value) - firstIndexes.get(value) + 1);
            }
        }

        return shortest;
    }
}
