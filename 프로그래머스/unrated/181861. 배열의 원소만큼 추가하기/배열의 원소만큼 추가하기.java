import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int round = target;
            while(round-- != 0) list.add(target);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}