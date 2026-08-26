class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        boolean[] arr = new boolean[100000];

        for (int i : nums) arr[i] = true;
        int ans = k;

        while (true) {

            System.out.print(ans + " ");

            if (arr[ans]) ans += k;
            else break;

        }

        return ans;
    }
}