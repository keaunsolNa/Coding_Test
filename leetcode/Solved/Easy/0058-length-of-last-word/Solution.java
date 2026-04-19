class Solution {
	public int lengthOfLastWord(String s) {

		String[] arr = s.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!arr[i].isEmpty()) {
				return arr[i].length();
			}


		}

		return 0;
	}
}