package codingTestLevel1;

public class Lessons65 {

	public static void main(String[] args) {
		
		Lessons65 lessons65 = new Lessons65();
		
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		int result = lessons65.solution(babbling);
		
		System.out.println("result : " + result);
	}
	
    	
    public int solution(String[] babbling) {

//    	옹알이(2)
//    	머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 
//    	조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 
//    	문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
    	String[] can = {"aya", "ye", "woo", "ma"};	
    	String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
    	
    	int answer = 0;
    	for(int i = 0; i < babbling.length; i++) {
    		String bab = babbling[i];
    		
    		for(int j = 0; j < cant.length; j++) {
    			bab = bab.replace(cant[j], "X");
    		}
    		
    		for(int j = 0; j < can.length; j++) {
    			bab = bab.replace(can[j], "?");
    		}
    		
    		int sign = 0;
    		for(int j = 0; j < bab.length(); j++) {
    			if(!bab.subSequence(j, j+1).equals("?")) {
    				sign = 1;
    				break;
    			}
    		}
    		
    		if(sign == 0) {
    			answer++;
    		}
    	}
    	
    	return answer;
    }
    
	 
}

    	
