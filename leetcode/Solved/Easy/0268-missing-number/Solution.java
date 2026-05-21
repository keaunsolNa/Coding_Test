class Solution {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);

		int min = nums[0];

		if (min != 0) return 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min++) return i;
		}

		return nums[nums.length - 1] + 1;
	}
}