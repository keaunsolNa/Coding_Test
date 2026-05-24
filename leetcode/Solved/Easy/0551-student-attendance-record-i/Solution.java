class Solution {
	public boolean checkRecord(String s) {

		int aCnt = 0;
		int lCnt = 0;
		for (char c : s.toCharArray()) {

			switch(c) {
				case 'A' : aCnt++; lCnt = 0; break;
				case 'L' : lCnt++; break;
				case 'P' : lCnt = 0; break;
			}

			if (aCnt == 2) return false;

			if (lCnt == 3) return false;

		}

		return true;
	}
}