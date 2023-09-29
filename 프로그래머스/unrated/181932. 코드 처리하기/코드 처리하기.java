class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();;
        
        boolean mode = true;
        for(int i = 0; i < code.length(); i++) {

            if(code.charAt(i) != '1') {
                
                if(mode) {
                    if(i % 2 == 0) answer.append(code.charAt(i));                
                } else  {
                    if(i % 2 != 0) answer.append(code.charAt(i));                
                }

            } else {
                mode = !mode;
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
        
    }
}