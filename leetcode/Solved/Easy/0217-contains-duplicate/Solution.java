class Solution {
    public boolean containsDuplicate(int[] nums) {

		int length = nums.length;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < length; i++) {
			set.add(nums[i]);
		}

		return length != set.size();
    }
}