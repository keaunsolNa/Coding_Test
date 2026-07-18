import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		// Precompute each value in nums2 -> its next greater element with one monotonic-stack pass.
		Map<Integer, Integer> nextGreater = new HashMap<>();
		Deque<Integer> stack = new ArrayDeque<>();

		for (int num : nums2) {
			while (!stack.isEmpty() && stack.peek() < num) {
				nextGreater.put(stack.pop(), num);
			}
			stack.push(num);
		}

		int[] answer = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			answer[i] = nextGreater.getOrDefault(nums1[i], -1);
		}

		return answer;
	}
}
