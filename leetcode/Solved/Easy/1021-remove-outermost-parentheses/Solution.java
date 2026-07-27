class Solution {
    public String removeOuterParentheses(String s) {
        
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            
            
            if (c == '(') {
                sb.append(c);
            }
            else {

                sb.append(c);
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