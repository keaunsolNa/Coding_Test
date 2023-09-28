import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String myString) {
        
        int number = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < myString.length(); i++) {

            if(myString.charAt(i) == 'x') {
                list.add(number);
                number = 0;
            }
            
            else number++;
           
            if(i == myString.length() - 1) list.add(number);
        }
       
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);

        return answer;
    }
}