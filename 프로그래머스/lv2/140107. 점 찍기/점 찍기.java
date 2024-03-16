import java.util.*;
class Solution {
    
    public long solution(int k, int d) {

        long answer = 0;
        long dis = (long) Math.pow(d, 2);
        long xx;
        
        for (int x = 0; x <= d; x += k) {
            
            xx = (long) Math.pow(x, 2);
            int yy = (int) Math.sqrt(dis - xx);
            answer += (yy / k) + 1;
        }

        return answer;
    }
}