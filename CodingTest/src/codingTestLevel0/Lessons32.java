package codingTestLevel0;

public class Lessons32 {
	
	// 배열 자르기
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int cnt = 0;
        for(int i = num1; i <= num2; i++){
            answer[cnt] = numbers[i];
            cnt++;
        }
        return answer;
    }
}