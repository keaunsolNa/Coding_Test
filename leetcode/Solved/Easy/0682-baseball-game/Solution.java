class Solution {
	public int calPoints(String[] operations) {

		Stack<Integer> stack = new Stack<>();

		for (String s : operations) {

			switch(s) {

				case "+" :
					Integer temp = stack.pop();
					Integer plus = stack.peek() + temp;
					stack.add(temp);
					stack.add(plus);
					break;

				case "D" :
					stack.add(stack.peek() * 2);
					break;

				case "C" :
					stack.pop();
					break;

				default :
					stack.add(Integer.parseInt(s));
					break;
			}

			System.out.println(stack);
		}


		int ans = 0;
		while(!stack.isEmpty()) {
			ans += stack.pop();
		}

		return ans;
	}
}