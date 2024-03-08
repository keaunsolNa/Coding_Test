import java.util.*;

class Solution {
    
    public int solution(int[][] jobs) {
        
        int answer = 0;
        int nowTime = 0;

        PriorityQueue<int[]> workTime = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        PriorityQueue<int[]> inTime = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        
        for (int[] job : jobs) inTime.add(job);
        
        while (!inTime.isEmpty() || !workTime.isEmpty()) {

            while (!inTime.isEmpty() && inTime.peek()[0] <= nowTime)
                workTime.add(inTime.poll());
            
            if (workTime.isEmpty()) nowTime = inTime.peek()[0];
            
            else {

                int[] job = workTime.poll();
                answer += nowTime + job[1] - job[0];
                nowTime += job[1];
                
            }
            
        }
        
        return answer / jobs.length;
    }
}