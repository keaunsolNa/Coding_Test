class Solution {
    public boolean detectCapitalUse(String word) {

        int upperCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }

        // All uppercase ("USA") or all lowercase ("leetcode").
        if (upperCount == 0 || upperCount == word.length()) {
            return true;
        }

        // Otherwise only the leading character may be uppercase ("Google").
        return upperCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}
