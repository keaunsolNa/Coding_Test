class Solution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> indexByValue = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (indexByValue.containsKey(complement)) {
				return new int[] {indexByValue.get(complement), i};
			}
			indexByValue.put(nums[i], i);
		}

		return null;
	}
}
