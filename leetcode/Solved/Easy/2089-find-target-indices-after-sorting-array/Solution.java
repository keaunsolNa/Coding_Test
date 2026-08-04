class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int lessCount = 0;
        int equalCount = 0;

        for (int num : nums) {

            if (num < target) {
                lessCount++;
            } else if (num == target) {
                equalCount++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < equalCount; i++) {
            list.add(lessCount + i);
        }

        return list;
    }
}
