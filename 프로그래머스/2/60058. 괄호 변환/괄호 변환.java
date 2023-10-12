import java.util.*;
class Solution {
    public String solution(String p) {
        
        if(p.length() == 0) return "";
        
        String answer = "";
        String u = "";
        String v = "";
        int check = 0;
        
        for(int i = 0; i < p.length(); i++) {
            
            if(p.charAt(i) == '(') check++;
            else check--;
            
            if(check == 0) {
                u = p.substring(0, i + 1);
                v = p.substring(i + 1);
                break;
            };
            
        }
        
        if(solove(u)) return u + solution(v);
        
        else {
            
            answer = "(" + solution(v) + ")";
            
            for(int i = 1; i < u.length() - 1; i++) {
                
                if(u.charAt(i) == '(') answer += ')';
                else answer += '(';
                
            }
            
        }
        
        return answer;
    }
    
    private static boolean solove(String v) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < v.length(); i++) {
            
            if(v.charAt(i) == '(') stack.push('(');
            
            else if(stack.isEmpty()) return false; else stack.pop();
            
        }
        
        return true;
    }
}