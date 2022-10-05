package codingTestLevel1;

public class Lessons49 {

	public static void main(String[] args) {
		
		Lessons49 lessons49 = new Lessons49();
		String s = "AaZz";
		int n = 25;
		String result = lessons49.solution(s, n);
		
		System.out.println("result : " + result);
		
	}
	
    public String solution(String s, int n) {
    	
//    	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//    	예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. 
//    	"z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    	
    	char[] charArr = s.toCharArray();
    	int newS;
    	String answer = "";
    	
    	for(int i = 0; i < charArr.length; i++) {
    		int charArrToInt = Integer.valueOf(charArr[i]);
    		
    		if(charArrToInt == 32) {
    			answer += " ";
    			continue;
    		} 
    		if( n > 24) {
    			newS = charArrToInt + (n/24);
    		}
    			newS = charArrToInt + n;
    		if(charArrToInt >= 97 && newS > 122) {
    			int a = newS - 122;
    			newS = 96 + a;
    			answer += (char)newS;
    		} else if(charArrToInt <= 90 && newS > 90) {
    			int a = newS - 90;
    			newS = 64 + a;
    			answer += (char)newS;
    		} else {
    			answer += (char)newS;
    		}
    	}
    	
        return answer;
    }
}
