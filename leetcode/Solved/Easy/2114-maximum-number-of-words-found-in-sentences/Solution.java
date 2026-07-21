class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {

            String[] word = sentences[i].split(" ");
            max = Math.max(word.length, max);
        }

        return max;
    }
}