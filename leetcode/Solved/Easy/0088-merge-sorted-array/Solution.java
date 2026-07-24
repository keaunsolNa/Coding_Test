class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Copy nums2 into the tail slots of nums1, then sort in place.
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
