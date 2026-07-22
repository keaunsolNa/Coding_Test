class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx = 0;
        if (n == 0) return;
        
        for (int i = n; i < m; i++) {
            nums1[i] = nums2[idx];
            nums2[idx] = 0;
            idx++;
        }        

        Arrays.sort(nums1);


    }
}