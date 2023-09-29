import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {

        Set<Integer> list = new LinkedHashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            
            if(list.size() == k) break; 
        }
        
        Iterator<Integer> iter = list.iterator();

        int[] answer = new int[k];
        for(int i = 0; i < k; i++) {
            
            if(iter.hasNext()) answer[i] = iter.next();
            else answer[i] = -1;
        }
        return answer;
    }
}