class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;

        for (int num : nums) {

            int digits = 0;
            int rest = num;

            do {
                digits++;
                rest /= 10;
            } while (rest != 0);

            if (digits % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}
