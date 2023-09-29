import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] arr = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        
        for (String str : arr) 
            if (!str.isEmpty()) 
                result.add(str);
        
        String[] answer = result.toArray(new String[result.size()]);
        Arrays.sort(answer);
     
        return answer;
    }
}