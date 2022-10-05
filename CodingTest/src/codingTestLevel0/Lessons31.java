package codingTestLevel0;

public class Lessons31 {
	
	// 아이스 아메리카노
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money/5500;
        
        answer[1] = money%5500;
        
        return answer;
    }
}