class Solution {
	public int distributeCandies(int[] candyType) {

		int canEat = candyType.length / 2;
		Set<Integer> set = new HashSet<>();

		for (int c : candyType) {
			set.add(c);
		}

		return Math.min(canEat, set.size());

	}
}