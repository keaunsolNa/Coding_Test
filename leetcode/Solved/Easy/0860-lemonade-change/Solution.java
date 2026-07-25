class Solution {
	public boolean lemonadeChange(int[] bills) {

		int fiveCount = 0;
		int tenCount = 0;

		for (int bill : bills) {
			switch (bill) {
				case 5:
					fiveCount++;
					break;
				case 10:
					if (fiveCount == 0) {
						return false;
					}
					fiveCount--;
					tenCount++;
					break;
				case 20:
					// Pay the 15 change with a 10 + a 5 first, so the scarcer 5 bills are conserved.
					if (tenCount > 0 && fiveCount > 0) {
						tenCount--;
						fiveCount--;
					} else if (fiveCount >= 3) {
						fiveCount -= 3;
					} else {
						return false;
					}
					break;
				default:
					throw new IllegalArgumentException("Unexpected bill: " + bill);
			}
		}

		return true;
	}
}
