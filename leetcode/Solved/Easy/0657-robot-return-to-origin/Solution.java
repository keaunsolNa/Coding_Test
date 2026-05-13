class Solution {
	public boolean judgeCircle(String moves) {

		int[] pos = new int[2];

		for (char c : moves.toCharArray()) {

			switch(c) {
				case 'U' : pos[0]++;
					break;
				case 'D' : pos[0]--;
					break;
				case 'R' : pos[1]++;
					break;
				case 'L' : pos[1]--;
					break;
			}
		}

		return pos[0] == 0 && pos[1] == 0;
	}
}