class Solution {
    public List<String> commonChars(String[] words) {

        int[] minCount = new int[26];
        Arrays.fill(minCount, Integer.MAX_VALUE);

        for (String word : words) {

            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minCount[i] = Math.min(minCount[i], count[i]);
            }
        }

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            String letter = String.valueOf((char) ('a' + i));

            for (int j = 0; j < minCount[i]; j++) {
                answer.add(letter);
            }
        }

        return answer;
    }
}
