class Solution {
	public boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) return false;
		Map<Character, Character> sToT = new HashMap<>();
		Map<Character, Character> tToS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char sc = s.charAt(i);
			char tc = t.charAt(i);

			if (sToT.containsKey(sc)) {
				if (sToT.get(sc) != tc) {
					return false;
				}
			} else {
				sToT.put(sc, tc);
			}

			// 역방향 매핑 검사
			if (tToS.containsKey(tc)) {
				if (tToS.get(tc) != sc) {
					return false;
				}
			} else {
				tToS.put(tc, sc);
			}
		}

		return true;
	}
}