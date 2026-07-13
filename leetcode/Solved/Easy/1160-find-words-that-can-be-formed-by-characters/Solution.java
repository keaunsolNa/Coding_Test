class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] availableCharCount = new int[26];
      
        for (int i = 0; i < chars.length(); i++) {
            availableCharCount[chars.charAt(i) - 'a']++;
        }
      
        int totalLength = 0;
      
        for (String word : words) {

            int[] wordCharCount = new int[26];
            boolean canFormWord = true;
          
            for (int i = 0; i < word.length(); i++) {
                int charIndex = word.charAt(i) - 'a';
                wordCharCount[charIndex]++;
              
                if (wordCharCount[charIndex] > availableCharCount[charIndex]) {
                    canFormWord = false;
                    break;
                }
            }
          
            if (canFormWord) {
                totalLength += word.length();
            }
        }
      
        return totalLength;
    }
}