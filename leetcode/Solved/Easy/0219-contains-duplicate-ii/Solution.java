import java.util.HashSet;
import java.util.Set;

class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Set<Integer> window = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (!window.add(nums[i])) return true;
			if (window.size() > k) window.remove(nums[i - k]);
		}

		return false;
	}
}
