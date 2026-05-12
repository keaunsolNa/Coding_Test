class Solution {
	public boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int[] sToT = new int[256];
		int[] tToS = new int[256];

		for (int i = 0; i < s.length(); i++) {

			char sc = s.charAt(i);
			char tc = t.charAt(i);

			if (sToT[sc] != tToS[tc]) {
				return false;
			}

			sToT[sc] = i + 1;
			tToS[tc] = i + 1;
		}

		return true;
	}
}
