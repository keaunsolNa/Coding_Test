import java.util.Arrays;

class Solution {

	// Must exceed the problem's max arr[i] (10^4) so the encoded key sorts by bit count first, then by value.
	private static final int BIT_COUNT_WEIGHT = 100000;

	public int[] sortByBits(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + (Integer.bitCount(arr[i]) * BIT_COUNT_WEIGHT);
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] % BIT_COUNT_WEIGHT;
		}

		return arr;
	}
}
