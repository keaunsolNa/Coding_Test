class Solution {
	public String addBinary(String a, String b) {

		int aLen = a.length();
		int bLen = b.length();
		int maxLength = Math.max(aLen, bLen);
		StringBuilder sb = new StringBuilder();
		int carry = 0;

		for (int i = 0; i < maxLength; i++) {
			int sum = carry;
			if (i < aLen) {
				sum += a.charAt(aLen - i - 1) - '0';
				System.out.println("A : " + (a.charAt(aLen - i - 1) - '0'));
			}

			if (i < bLen) {
				sum += b.charAt(bLen - i - 1) - '0';
			}

			sb.append(sum % 2);
			carry = sum / 2;

		}

		if (carry != 0) sb.append(carry);

		return sb.reverse().toString();
	}
}