class Solution {
	public String[] findRelativeRanks(int[] score) {

		Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

		for (int i = 0; i < score.length; i++) {

			map.put(score[i], i);
		}

		Map<Integer, String> map2 = new TreeMap<>();
		int flag = 0;
		for (Integer key : map.keySet()) {

			switch(flag) {
				case 0 : map2.put(map.get(key), "Gold Medal");
					break;
				case 1 : map2.put(map.get(key), "Silver Medal");
					break;
				case 2 : map2.put(map.get(key), "Bronze Medal");
					break;
				default : map2.put(map.get(key), String.valueOf(flag + 1));
			}
			flag++;
		}

		String[] ans = new String[score.length];

		for (int i = 0; i < map2.size(); i++) {

			ans[i] = map2.get(i);
		}

		return ans;
	}
}