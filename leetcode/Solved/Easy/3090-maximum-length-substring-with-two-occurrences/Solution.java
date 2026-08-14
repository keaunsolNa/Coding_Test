class Solution {
    public int maximumLengthSubstring(String s) {
        
        int[] arr = new int[26];
        int maxLength = 0;
      
        // Use sliding window technique with two pointers
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            // Get the index of current character (0-25 for a-z)
            int target = s.charAt(right) - 'a';
          
            // Increment frequency of current character
            arr[target]++;
          
            // If any character appears more than 2 times, shrink window from left
            while (arr[target] > 2) {
                int leftCharIndex = s.charAt(left) - 'a';
                arr[leftCharIndex]--;
                left++;
            }
          
            // Update maximum length found so far
            // Window size is (right - left + 1)
            maxLength = Math.max(maxLength, right - left + 1);
        }
      
        return maxLength;
    }
}