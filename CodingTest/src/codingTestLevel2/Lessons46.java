package codingTestLevel2;

public class Lessons46 {

	public static void main(String[] args) {

		Lessons46 lessons46 = new Lessons46();

		int answer = lessons46.solution("EIO");

		System.out.println("ANSER : " + answer);
		
	}
	
	public int solution(String word) {
		
//		모음사전
//		사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다. 
//		사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.
//
//		단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.
				
		int answer = 0;
		int total = 3905;		// 5 + 25 + 125 + 625 + 3125
		String dictionary = "AEIOU";
		
		for (int i = 0; i < word.length(); i++) {
			total /= 5;			// A--- 781, E--- 165, I--- 31, O--- 6, U--- 1
            answer += total*dictionary.indexOf(word.charAt(i))+1;
		}
		
        return answer;
    }
	
}
	