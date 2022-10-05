package codingTestLevel0;

public class Lessons49 {
	
	// 숨어있는 숫자의 덧셈(1)
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            answer += Character.getNumericValue(my_string.charAt(i));
        }
        
        return answer;
    }
}