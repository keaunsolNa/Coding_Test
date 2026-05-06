class Solution {
	public List<String> summaryRanges(int[] nums) {

		if (nums.length == 0) return new ArrayList<>();

		List<String> list = new ArrayList<>();
		Deque<Long> dq = new ArrayDeque<>();
		dq.add((long) nums[0]);

		for (int i = 1; i < nums.length; i++) {

			if (dq.peekLast() + 1 != nums[i]) {

				if (dq.size() == 1) {
					list.add(String.valueOf(dq.peekLast()));
				}

				else {
					list.add(dq.pollFirst() + "->" + dq.peekLast());
				}

				dq.clear();
				dq.add((long) nums[i]);

			}
			else {
				dq.add((long) nums[i]);
			}
		}

		if (!dq.isEmpty())
		{
			if (dq.size() == 1) list.add(String.valueOf(dq.pop()));
			else {
				list.add(dq.pollFirst() + "->" + dq.pollLast());
			}
		}

		return list;

	}
}