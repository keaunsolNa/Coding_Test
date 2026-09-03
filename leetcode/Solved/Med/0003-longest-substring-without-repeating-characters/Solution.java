class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] arr = new int[128];

        int max = 0;
        int len = s.length();
        int left = 0;

        for (int right = 0; right < len; right++) {

            char cur = s.charAt(right);
            arr[cur]++;

            while (arr[cur] > 1) {
                arr[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
