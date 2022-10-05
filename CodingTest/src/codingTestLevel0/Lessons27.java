package codingTestLevel0;

public class Lessons27 {
	
	// 문자열 안에 문자열
    public int solution(String str1, String str2) {
        
        if(str1.contains(str2)){
            return 1;
        } else {
            return 2;
        }
    }
}