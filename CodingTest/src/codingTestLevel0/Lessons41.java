package codingTestLevel0;

public class Lessons41 {
	
	// 숫자 찾기
    public int solution(int num, int k) {
        
        String temp = num +"";
        if(temp.indexOf(k+"") == -1) {
        	return -1;
        } else {
        	return temp.indexOf(k+"") + 1;
        }
    }
}