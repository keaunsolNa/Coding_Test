import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < skip.length(); i++) list.add((int)skip.charAt(i));
        
        for(int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i);
            
            for(int j = 0; j < index; j++) {
                temp++;
                if(temp > 122) temp = 97;
                if(list.contains(temp)) j--;
            }
            
            answer += (char)temp;
        }
        return answer;
    }
}