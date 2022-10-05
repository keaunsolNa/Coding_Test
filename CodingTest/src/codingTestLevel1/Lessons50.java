package codingTestLevel1;

public class Lessons50 {

	public static void main(String[] args) {
		
		Lessons50 lessons50 = new Lessons50();
		String s = " try hello world ";
		String result = lessons50.solution(s);
		
		System.out.println("result : " + result);
		
	}
	
    public String solution(String s) {
     
//    	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
//    	각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//    	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    	
    	
    	String[] stringArr = new String[s.length()];
   		stringArr = s.split(" ", -1);
    	String answer = "";
    	
    	for(int i = 0; i < stringArr.length; i++) {
    		
    		for(int j = 0; j < stringArr[i].length(); j++) {
    			if(j == 0 || j%2 == 0) {
    				String upper = stringArr[i].charAt(j) + "";
    				answer += upper.toUpperCase();
    			} else {
    				String lower = stringArr[i].charAt(j) + "";
    				answer += lower.toLowerCase();
    			}
    		}
   			answer += " ";
    	}
    	
    	answer = answer.substring(0, answer.length() -1);
        return answer;
    }
}
