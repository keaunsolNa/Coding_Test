import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        
        String temp = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < myStr.length(); i++) {
            
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                if(!temp.equals("")) list.add(temp);
                temp = "";
            } else temp += myStr.charAt(i);
        }
        
        if(!temp.equals("")) list.add(temp);
        if(list.size() == 0) return new String[]{"EMPTY"};
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);

        return answer;
    }
}