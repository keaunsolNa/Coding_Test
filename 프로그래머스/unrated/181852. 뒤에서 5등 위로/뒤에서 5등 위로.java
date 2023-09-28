import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        int[] answer = new int[num_list.length - 5];
        int cnt = 0;
        for (int i = 5; i <= num_list.length - 1; i++ ) 
            answer[cnt++] = num_list[i];
        
        return answer;
    }
}