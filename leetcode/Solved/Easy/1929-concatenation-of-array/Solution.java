class Solution {
	public int[] getConcatenation(int[] nums) {
		int n = nums.length;

		int[] arr = new int[2 * n];
		System.arraycopy(nums, 0, arr, 0, n);
		System.arraycopy(nums, 0, arr, n, n);

		return arr;
	}
}