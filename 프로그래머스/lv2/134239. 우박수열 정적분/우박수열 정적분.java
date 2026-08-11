import java.util.*;
import java.io.*;

class Solution {
    
    public double[] solution(int k, int[][] ranges) {

        double[] answer = new double[ranges.length];
        List<Double> sequence = new ArrayList<>();
        int cnt = 0;
        
        while (k > 1) 
        {
            sequence.add((double)k);
            if (k % 2 == 0) k /= 2;
            else k = k * 3 + 1;
            cnt++;
        }
        
        sequence.add(1.0);
        
        // 사다리꼴
        double[] area = new double[cnt + 1];
        for(int i=1; i<cnt+1; i++) area[i] = (sequence.get(i - 1) + sequence.get(i))/2;
        
        
        // 넓이 누적합
        double[] prefixSum = new double[cnt + 1];
        prefixSum[1] = area[1];
        for (int i = 2; i < cnt + 1; i++) prefixSum[i] = (area[i] + prefixSum[i - 1]);
        
        for (int i = 0; i < ranges.length; i++) 
        {
            
            int s = ranges[i][0];
            int e = cnt + ranges[i][1];
            
            if (e > s) 
            {
                double val = prefixSum[e] - prefixSum[s];
                String str = String.format("%.1f", val);
                answer[i] = Double.parseDouble(str);
            }
            
            else if (s > e) answer[i] = -1.0;
            else answer[i] = 0.0; 
        }
     
        return answer;
    }
    
}