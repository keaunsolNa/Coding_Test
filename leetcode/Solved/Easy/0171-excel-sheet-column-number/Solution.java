class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {

            char tar = columnTitle.charAt(i);
          
            int val = tar - 'A' + 1;
          
            ans = ans * 26 + val;
        }

        return ans;
    }
}