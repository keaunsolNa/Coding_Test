class Solution {
    public String sortSentence(String s) {

        String[] tokens = s.split(" ");
        String[] words = new String[tokens.length];

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];
            int position = token.charAt(token.length() - 1) - '1';

            words[position] = token.substring(0, token.length() - 1);
        }

        return String.join(" ", words);
    }
}
