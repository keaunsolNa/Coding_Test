class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) == 3) map.remove(nums[i]);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            ans = key;
        }

        return ans;
    }
}