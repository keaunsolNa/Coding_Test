class Solution {

	List<List<Integer>> result = new ArrayList<>();
	List<Integer> quad = new ArrayList<>();
	int[] nums;

    public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		this.nums = nums;
		ksum(3, 0, 0L);

		return result;
    }


	private void ksum(int k, int start, long target) {

		if (k != 2) {

			for (int i = start; i <= nums.length - k; i++) {

				if (i > start && nums[i] == nums[i - 1]) continue;

				quad.add(nums[i]);

				ksum(k - 1, i + 1, target - nums[i]);

				quad.remove(quad.size() - 1);
			}

			return;
		}

		int left = start;
		int right = nums.length - 1;

		while (left < right) {

			long sum = (long) nums[left] + nums[right];

			if (sum < target) left++;
			else if (sum > target) right--;
			else {

				List<Integer> temp = new ArrayList<>(quad);
				temp.add(nums[left]);
				temp.add(nums[right]);

				result.add(temp);

				left++;

				while (left < right && nums[left] == nums[left - 1]) left++;
			}

		}
	}
}