class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        int ans = 0;

        for (int i = 0; i < words.length; i++) {

            String reverse = new StringBuilder(words[i]).reverse().toString();

            for (int j = i + 1; j < words.length; j++) {

                if (reverse.length() == words[j].length() && reverse.equals(words[j])) {
                    ans++;
                    break;
                }

            }
        }

        return ans;
    }
}