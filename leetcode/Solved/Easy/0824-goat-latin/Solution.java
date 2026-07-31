class Solution {

	private static final String VOWELS = "aeiouAEIOU";

	public String toGoatLatin(String sentence) {

		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			if (i > 0) {
				result.append(" ");
			}

			String word = words[i];
			char firstChar = word.charAt(0);

			if (VOWELS.indexOf(firstChar) >= 0) {
				result.append(word);
			} else {
				result.append(word, 1, word.length()).append(firstChar);
			}

			result.append("ma");

			for (int j = 0; j <= i; j++) {
				result.append("a");
			}
		}

		return result.toString();
	}
}
