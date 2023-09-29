import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for(int i = 0; i < queries.length; i++) {
            
            for(int j = queries[i][0]; j <= queries[i][1]; j++) 
                if(arr[j] > queries[i][2]) 
                    if(answer[i] > arr[j]) answer[i] = arr[j];
                
            if(answer[i] == Integer.MAX_VALUE) answer[i] = -1;
            
        }
        return answer;
    }
}