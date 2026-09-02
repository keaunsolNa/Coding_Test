class Solution {
    public String firstPalindrome(String[] words) {

        for (String str : words) {

            if (isPalindrom(str)) return str;
        }        

        return "";
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