class Solution {

    private static final int ALPHABET_SIZE = 26;

    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] plateCounts = countLetters(licensePlate);
        String answer = null;

        for (String word : words) {

            if (answer != null && word.length() >= answer.length()) {
                continue;
            }

            if (covers(countLetters(word), plateCounts)) {
                answer = word;
            }
        }

        return answer;
    }

    private int[] countLetters(String source) {

        int[] counts = new int[ALPHABET_SIZE];

        for (int i = 0; i < source.length(); i++) {

            char letter = Character.toLowerCase(source.charAt(i));

            if (letter >= 'a' && letter <= 'z') {
                counts[letter - 'a']++;
            }
        }

        return counts;
    }

    private boolean covers(int[] candidate, int[] required) {

        for (int i = 0; i < ALPHABET_SIZE; i++) {

            if (candidate[i] < required[i]) {
                return false;
            }
        }

        return true;
    }
}
