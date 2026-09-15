class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        Set<String> unpaired = new HashSet<>();
        int pairs = 0;

        for (String word : words) {

            String reversed = new StringBuilder(word).reverse().toString();

            if (unpaired.remove(reversed)) {
                pairs++;
            } else {
                unpaired.add(word);
            }
        }

        return pairs;
    }
}
