class Solution {
	public char nextGreatestLetter(char[] letters, char target) {


		int targetInt = target - 'a';

		int min = 999;
		for (int i = 0; i < letters.length; i++) {

			int temp = letters[i] - 'a';
			if (temp > targetInt) min = Math.min(min, temp);
		}

		return min == 999 ? letters[0] : ((char) (min + 'a'));
	}
}