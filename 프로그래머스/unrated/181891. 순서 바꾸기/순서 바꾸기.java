import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> front = new ArrayList<>();
        List<Integer> back = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++) {
            
            if(i < n) front.add(num_list[i]);
            else back.add(num_list[i]);
        }
        
        back.addAll(front);

        int[] answer = new int[back.size()];
        for(int i = 0; i < back.size(); i++) answer[i] = back.get(i);
        return answer;
    }
}