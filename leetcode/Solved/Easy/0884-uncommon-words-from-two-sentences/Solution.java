class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> counts = new HashMap<>();

        countWords(s1, counts);
        countWords(s2, counts);

        List<String> uncommonWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {

            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords.toArray(new String[0]);
    }

    private void countWords(String sentence, Map<String, Integer> counts) {

        for (String word : sentence.split(" ")) {
            counts.merge(word, 1, Integer::sum);
        }
    }
}
