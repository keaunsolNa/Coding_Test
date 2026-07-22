class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx = 0;
        if (n == 0) return;
        if (m == 0) 
        {
            nums1[0] = nums2[0];
            nums2[0] = 0;
            return;
        }
        for (int i = n; i < m + n; i++) {
            nums1[i] = nums2[idx];
            nums2[idx] = 0;
            idx++;
        }        

        Arrays.sort(nums1);


    }
}