class Solution {
	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) == null) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(nums[i], list);
			} else {
				map.get(nums[i]).add(i);
			}
		}

		Arrays.sort(nums);

		int one = 0;
		int two = 0;
		int hab = 0;

		for (int i = 0; i < nums.length; i++) {

			one = nums[i];
			for (int j = nums.length - 1; j >= 0; j--) {

				if (i == j) continue;

				two = nums[j];
				hab = one + nums[j];

				if (hab == target) {

					int[] answer;
					if (one == two) {
						answer = new int[]{map.get(one).get(0), map.get(one).get(1)};
					} else {
						answer = new int[]{map.get(one).get(0), map.get(two).get(0)};
					}

					return answer;
				}
				if (hab < target) break;
			}
		}

		return null;
	}
}