class Solution {
	public boolean divisorGame(int n) {

		boolean alice = false;
		while (true) {

			boolean check = false;
			for (int i = 1; i < n; i++) {

				if (n % i == 0) {
					n = n - i;
					alice = !alice;
					check = true;
					break;
				}
			}

			if (!check) break;
		}

		return alice;
	}
}