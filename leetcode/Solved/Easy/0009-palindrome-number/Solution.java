class Solution {
	public boolean isPalindrome(int x) {

		if (x < 0) return false;

		int original = x;
		int reverse = 0;

		while (original > 0) {
			int lastdig = original % 10;
			reverse = reverse * 10 + lastdig;
			original = original / 10;
		}

		return x == reverse;

	}
}