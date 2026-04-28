class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}

		List<Integer> list = new ArrayList<>();

		for (int j : nums2) {

			if (map.containsKey(j)) {

				if (map.get(j) > 0) {
					list.add(j);
					map.put(j, map.get(j) - 1);
				}
				else {
					map.remove(j);
				}
			}

		}

		int[] array = list.stream()
		.mapToInt(Integer::intValue)
		.toArray();

		return array;
	}
}