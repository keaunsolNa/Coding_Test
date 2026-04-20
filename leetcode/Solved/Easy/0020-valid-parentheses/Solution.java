class Solution {
    public boolean isValid(String s) {

		if (s.length() % 2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();

		for (char c : arr) {

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (stack.size() == 0) {
				return false;
			} else if (c == ')') {
				if (stack.pop() != '(') return false;
			} else if (c == '}') {
				if (stack.pop() != '{') return false;
			} else if (c == ']') {
				if (stack.pop() != '[') return false;
			}
		}

		return stack.size() == 0;
    }
}