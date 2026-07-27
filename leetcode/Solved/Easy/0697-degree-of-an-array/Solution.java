class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;
        int target = 0;
        int startIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (maxCnt < map.get(nums[i])) {

                maxCnt = map.get(nums[i]);
                target = nums[i];
                maxIndex = i;
            }

        }   

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                startIndex = i;
                break;
            }
        }

        return maxIndex - startIndex + 1;

    }
}