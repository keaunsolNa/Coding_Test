import java.io.*;

class Solution {
    public long solution(int[] sequence) {
        
        long answer = 0, num1 = 0, num2 = 0; 
        boolean flag = true;
        
        for (int num: sequence) {

            // 누적 합 방식으로 flag에 따라 펄스 수열 (-1, 1) 곱한 값 더해준다.
            num1 += flag ? num : -num;
            num2 += flag ? -num : num;     
        
            // 부분 수열의 합의 최솟값은 0. 
            // 최솟값 이하라면 초기화
            num1 = Math.max(0, num1);
            num2 = Math.max(0, num2);
            
            answer = Math.max(answer, Math.max(num1, num2));         
            
            flag = !flag;       
        }   
        
        return answer;
        
    }
}