import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int i = 0;
        
        List<Integer> list = new ArrayList<>();
        while(i < arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if(list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i]);
                i++;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++) answer[j] = list.get(j);
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}