package codingTestLevel2;

import java.util.Stack;

public class Lessons50 {
	
	public static void main(String[] args) {

		Lessons50 lessons50 = new Lessons50();

		String s = "}]()[{";
		
		int answer = lessons50.solution(s);

		System.out.println(answer);
		
	}
	
	public int solution(String s) {
		
//		괄호 회전하기		
//		다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
//
//		(), [], {} 는 모두 올바른 괄호 문자열입니다.
//		만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 
//		예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
//		만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 
//		예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
//		대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 
//		이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
				
        int answer = 0;
        if(s.length()%2 != 0) {
        	return 0;
        }
        
        String str = s;
        for(int i = 0; i < s.length(); i++) {
        	if(check(str))answer++;
        	System.out.println(i + "번째 ANSER : " + answer);
        	str = str.substring(1, s.length()) + str.charAt(0);
        }
        
        return answer;
    }
	
	public boolean check(String str) {
		
		Stack<Character> charArr = new Stack<>();
		System.out.println("STR : " + str);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '[') {
				charArr.add('[');
			} else if(str.charAt(i) == '{') {
				charArr.add('{');
			} else if(str.charAt(i) == '(') {
				charArr.add('(');
			} else if(str.charAt(i) == ']') {
				System.out.println(charArr);
				if(charArr.isEmpty() || charArr.peek() != '[') return false;
				charArr.pop();
			} else if(str.charAt(i) == '}') {
				System.out.println(charArr);
				if(charArr.isEmpty() || charArr.peek() != '{') return false;
				charArr.pop();
			} else if(str.charAt(i) == ')') {
				System.out.println(charArr);
				if(charArr.isEmpty() || charArr.peek() != '(') return false;
				charArr.pop();
			}
		}
		
		System.out.println("charArr : " + charArr);
		return true;
	}
	
}