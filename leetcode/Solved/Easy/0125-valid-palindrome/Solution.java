class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        return isPalindrom(str);

    }

    public boolean isPalindrom(String str) {

        if (str == null) {
            return false;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true; 
    }
}