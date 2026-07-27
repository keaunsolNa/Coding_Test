class Solution {
    public String removeOuterParentheses(String s) {
        
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            
            if (c == '(') stack.push(c);
            
            else {
                
                if (stack.peek() == '(' ) stack.pop();
                else stack.push(c);

            }

            sb.append(c);

            if (stack.size() == 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }

            System.out.println(stack);
        }

        System.out.println(list);
        

        sb.setLength(0);

        for (String str : list) {
            
            sb.append(str.replaceAll("^.|.$", ""));
        }

        return sb.toString();
    }
}