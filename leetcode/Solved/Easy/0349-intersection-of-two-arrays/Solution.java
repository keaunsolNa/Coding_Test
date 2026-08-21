class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] arr = new boolean[1001];
        int cnt = 0;

        for (int i : nums1) {
            arr[i] = true;
        }

        List<Integer> list = new ArrayList<>();

        for (int i : nums2) {
            

            if(arr[i] && !list.contains(i)) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) ans[i] = list.get(i);

        return ans;
    }
}