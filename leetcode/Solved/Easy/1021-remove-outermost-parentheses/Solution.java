class Solution {
    public String removeOuterParentheses(String s) {
        
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            
            String target = String.valueOf(c);

            if (c == '(') stack.push(target);
            
            else {
                
                if (stack.peek().equals(")")) stack.pop();
                else stack.push(target);

            }

            sb.append(target);

            if (stack.size() == 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }

        System.out.println(list);
        

        sb.setLength(0);

        for (String str : list) {
            
            sb.append(str.replaceAll("^.|.$", ""));
        }

        return sb.toString();
    }
}