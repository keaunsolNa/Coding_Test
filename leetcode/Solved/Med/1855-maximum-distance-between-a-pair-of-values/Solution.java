class Solution {
	public int maxDistance(int[] nums1, int[] nums2) {

		int max = 0;

		for (int i = 0; i < nums1.length; i++) {

			int left = 0;
			int right = nums2.length - 1;

			while (left <= right) {

				int mid = (left + right) / 2;

				if (nums2[mid] >= nums1[i]) {
					max = Math.max(mid - i, max);
					left = mid + 1;
				}

				else if (nums2[mid] < nums1[i]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
		}

		return max;
	}
}