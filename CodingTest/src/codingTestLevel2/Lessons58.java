package codingTestLevel2;

public class Lessons58 {
	
	public static void main(String[] args) {

		Lessons58 lessons58 = new Lessons58();
		String answer = lessons58.solution(16, 16, 2, 2);

		System.out.println("ANSER : " + answer);
		
	}
    
	public String solution(int n, int t, int m, int p) {
		
//		N진수 게임
//		튜브가 활동하는 코딩 동아리에서는 전통적으로 해오는 게임이 있다. 이 게임은 여러 사람이 둥글게 앉아서 숫자를 하나씩 차례대로 말하는 게임인데, 규칙은 다음과 같다.
//
//		숫자를 0부터 시작해서 차례대로 말한다. 첫 번째 사람은 0, 두 번째 사람은 1, … 열 번째 사람은 9를 말한다.
//		10 이상의 숫자부터는 한 자리씩 끊어서 말한다. 즉 열한 번째 사람은 10의 첫 자리인 1, 열두 번째 사람은 둘째 자리인 0을 말한다.
//		이렇게 게임을 진행할 경우,
//		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, …
//		순으로 숫자를 말하면 된다.
//
//		한편 코딩 동아리 일원들은 컴퓨터를 다루는 사람답게 이진수로 이 게임을 진행하기도 하는데, 이 경우에는
//		0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, …
//		순으로 숫자를 말하면 된다.
//
//		이진수로 진행하는 게임에 익숙해져 질려가던 사람들은 좀 더 난이도를 높이기 위해 이진법에서 십육진법까지 모든 진법으로 게임을 진행해보기로 했다. 
//		숫자 게임이 익숙하지 않은 튜브는 게임에 져서 벌칙을 받는 굴욕을 피하기 위해, 자신이 말해야 하는 숫자를 스마트폰에 미리 출력해주는 프로그램을 만들려고 한다. 튜브의 프로그램을 구현하라.
		
		
        StringBuffer radixBuffer = new StringBuffer();
        radixBuffer.append("0");
        for(int i = 1; i <= t*m; i++) {
        	radixBuffer.append(tobaseRadix(i, n));
        }
        System.out.println("TEST :" + 6%4);
        
        StringBuffer answer = new StringBuffer();
        
        for (int i = 0; i < t; i++) {
            answer.append(radixBuffer.charAt(p - 1));
            p += m; 
        }
        
        
        return answer.toString();
    }
	
	public String tobaseRadix(int number, int N) {
		StringBuilder sb = new StringBuilder();
	    long current = number;
	    
        while(current > 0){

        	if(current % N < 10){
                sb.append(current % N);
            } else {
                sb.append((char)(current % N - 10 + 'A'));
            }
        	
            current /= N;
            
        }
        
        if(current == 10) {
        	current = 'A';
        } else if(current == 11) {
        	current = 'B';
        } else if(current == 12) {
        	current = 'C';
        } else if(current == 13) {
        	current = 'D';
        } else if(current == 14) {
        	current = 'E';
        } else if(current == 15) {
        	current = 'F';
        }
        
        return sb.reverse().toString();
    }
	
	
	
	
}