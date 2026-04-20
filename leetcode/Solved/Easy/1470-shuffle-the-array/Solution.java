class Solution {
	public int[] shuffle(int[] nums, int n) {
		int[] arr = new int[2 * n];
		int j = 0;
		for (int i = 0; i < nums.length; i += 2) {
			arr[i] = nums[j++];
		}

		j = n;
		for (int i = 1; i < nums.length; i += 2) {
			arr[i] = nums[j++];
		}

		return arr;
	}
}