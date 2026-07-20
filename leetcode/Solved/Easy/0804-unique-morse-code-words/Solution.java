class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morseCodes = new String[] {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        Set<String> transformations = new HashSet<>();

        for (String word : words) {

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                builder.append(morseCodes[word.charAt(i) - 'a']);
            }

            transformations.add(builder.toString());
        }

        return transformations.size();
    }
}
