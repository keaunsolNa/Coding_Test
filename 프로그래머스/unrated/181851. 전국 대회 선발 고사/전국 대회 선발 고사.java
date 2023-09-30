import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
    
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((v1, v2) -> {
            return v1[1] - v2[1];
        });
        
        int size = rank.length;
        for(int i = 0 ; i < size ; i++)
            if(attendance[i])
                pq.offer(new int[]{i,rank[i]});
        
        for(int i = 0 ; i < 3 ; i++){
            
            answer *= 100;
            int[] now = pq.poll();
            answer += now[0];
            
        }
        
        return answer;
    }
}