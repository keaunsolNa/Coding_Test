class Solution {
	public void moveZeroes(int[] nums) {

		int nonZeroIndex = 0;
		int arrayLength = nums.length;

		for (int currentIndex = 0; currentIndex < arrayLength; currentIndex++) {

			if (nums[currentIndex] != 0) {

				int temp = nums[currentIndex];
				nums[currentIndex] = nums[nonZeroIndex];
				nums[nonZeroIndex] = temp;

				nonZeroIndex++;
			}
		}

	}
}