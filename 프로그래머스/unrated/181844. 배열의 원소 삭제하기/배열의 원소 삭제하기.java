import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
       
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        
        list.removeAll(deleteList);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}