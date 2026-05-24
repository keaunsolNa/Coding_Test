class Solution {
	public String removeDuplicates(String s) {

		List<Character> list = new ArrayList<>();

		for (char c : s.toCharArray()) {
			list.add(c);
		}

		while (true) {

			boolean flag = false;
			for (int i = 0; i < list.size() - 1; i++) {

				if (list.get(i) == list.get(i + 1)) {
					list.remove(i);
					list.remove(i);
					flag = true;
					break;
				}
			}

			if (!flag) break;
		}

		StringBuilder sb = new StringBuilder();
		for (char c : list) {
			sb.append(c);
		}

		return sb.toString();
	}
}