class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {

            // Depth 0 -> 1 opens a primitive and 1 -> 0 closes it; those are the
            // outermost parentheses, so append everything except those two.
            if (c == '(') {

                if (depth++ > 0) sb.append(c);
            }

            else {

                if (--depth > 0) sb.append(c);
            }
        }

        return sb.toString();
    }
}
