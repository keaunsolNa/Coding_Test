class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        return Arrays.stream(nums)
                     .distinct()
                     .boxed()
                     .sorted(Comparator.reverseOrder())
                     .limit(k)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
