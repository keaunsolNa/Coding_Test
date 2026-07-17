class Solution {

	// jewels and stones are limited to English letters, so an ASCII-sized table covers every input.
	private static final int ASCII_TABLE_SIZE = 128;

	public int numJewelsInStones(String jewels, String stones) {
		int[] jewelFlags = new int[ASCII_TABLE_SIZE];

		for (char jewel : jewels.toCharArray()) {
			jewelFlags[jewel] = 1;
		}

		int jewelCount = 0;
		for (char stone : stones.toCharArray()) {
			jewelCount += jewelFlags[stone];
		}

		return jewelCount;
	}
}
