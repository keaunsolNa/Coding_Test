package codingTestLevel0;

public class Lessons76 {

	public static void main(String[] arg) {
		solution("abc1Addfggg4556b", 6);
	}
	// 잘라서 배열로 저장하기
    public static String[] solution(String my_str, int n) {
    	
    	int length = 0;
    	if(my_str.length()%n == 0) {
    		length = my_str.length()/n;
    	} else {
    		length = my_str.length()/n + 1;
    	}
    	
    	String[] answer = new String[length];
    	
    	int cnt = 0;
    	while(!my_str.isEmpty()) {
    		if(my_str.length() > n) {
    			answer[cnt] = my_str.substring(0, n);
    			my_str = my_str.substring(n, my_str.length());
    			cnt++;
    		} else {
    			answer[cnt] = my_str;
    			my_str = "";
    		}
    	}
        return answer;
    }
    
}