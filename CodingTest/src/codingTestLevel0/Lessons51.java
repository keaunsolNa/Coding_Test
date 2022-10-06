package codingTestLevel0;

public class Lessons51 {
	
	// 개미 군단
    public int solution(int hp) {
        int answer = 0;
        answer += hp/5;
        hp = hp%5;
        answer += hp/3;
        hp = hp%3;
        answer += hp/1;
        return answer;
    }
}