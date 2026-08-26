class Solution {
    public int minimumChairs(String s) {
        
        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for (char c : s.toCharArray()) {

            if (c == 'E') stack.push(c);
            else if (c == 'L') stack.pop();

            ans = Math.max(ans, stack.size());
        }

        return ans;
    }
}