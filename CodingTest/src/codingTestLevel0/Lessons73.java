package codingTestLevel0;

public class Lessons73 {

	// 치킨 쿠폰
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            answer += chicken/10;  
            chicken = (chicken/10) + (chicken%10);
        }

        return answer;
    }
    
}