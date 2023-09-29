import java.util.*; 
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++) {
            
            int sta = intervals[i][0];
            int end = intervals[i][1];
            
            for(int j = sta; j <= end; j++) list.add(arr[j]);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}