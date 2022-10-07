package codingTestLevel0;

public class Lessons75 {

	public static void main(String[] args) {
		solution("aAb1B2cC34oOp");
	}
	// 숨어있는 숫자의 덧셈 (2)
    public static int solution(String my_string) {
    	String[] arrayString = my_string.replaceAll("[^0-9]", " ").split(" ");
    	
    	int answer = 0;
    	for(int i = 0; i < arrayString.length; i++) {
    		if(!arrayString[i].equals("")) {
    			answer += Integer.parseInt(arrayString[i]);
    		}
    	}
    	
        return answer;
    }
    
}