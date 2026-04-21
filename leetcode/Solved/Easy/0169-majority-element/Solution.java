class Solution {
    public int majorityElement(int[] nums) {

		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);

			if (map.get(i) > n / 2) return i;
		}

		return -1;
    }
}