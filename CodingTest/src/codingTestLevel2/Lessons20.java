package codingTestLevel2;

public class Lessons20 {
	
	public static void main(String[] args) {

		Lessons20 lessons20 = new Lessons20();
		
		String answer = lessons20.solution("3people Unfollowed Me");

		System.out.println("answer : " + answer);
		
	}
	
	public String solution(String s) {
		
//		JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
//		단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
//		문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
		StringBuilder answerString = new StringBuilder();

		s = s.toLowerCase();

		System.out.println(s);

		answerString.append(Character.toUpperCase(s.charAt(0)));
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				answerString.append(" ");
				System.out.println("AnswerString : " + answerString);
			} else if(s.charAt(i - 1) == ' ') {
				answerString.append(Character.toUpperCase(s.charAt(i)));
				System.out.println("AnswerString : " + answerString);
			} else {
				answerString.append(s.charAt(i));
				System.out.println("AnswerString : " + answerString);
			}
		}
		
        return answerString.toString();
    }
	
	
}
