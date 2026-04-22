class Solution {
    public String[] findWords(String[] words) {

		List<Character> list1 = "qwertyuiop".chars().mapToObj(c -> (char) c).toList();
		List<Character> list2 = "asdfghjkl".chars().mapToObj(c -> (char) c).toList();
		List<Character> list3 = "zxcvbnm".chars().mapToObj(c -> (char) c).toList();

		for (String word : words) {

			word = word.toLowerCase();


		}

    }
}