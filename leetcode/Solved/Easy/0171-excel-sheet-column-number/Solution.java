class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {

            char currentChar = columnTitle.charAt(i);
          
            int charValue = currentChar - 'A' + 1;
          
            ans = ans * 26 + charValue;
        }

        return ans;
    }
}