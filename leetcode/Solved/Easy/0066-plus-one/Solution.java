class Solution {
	public int[] plusOne(int[] digits) {

		int length = digits.length;

		while (true) {

			if (length == 0) {
				int[] newDigits = new int[digits.length + 1];
				newDigits[0] = 1;
				System.arraycopy(digits, 0, newDigits, 1, newDigits.length - 1);

				return newDigits;
			}
			if (digits[length - 1] != 9)
			{
				digits[length - 1]++;
				break;
			}
			else {
				digits[length - 1] = 0;
				length--;
			}
		}

		return digits;

	}
}