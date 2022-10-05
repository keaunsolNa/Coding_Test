package codingTestLevel0;

public class Lessons43 {
	
	// 가위 바위 보
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2'){
                sb.append('0');
            } else if(rsp.charAt(i) == '0'){
                sb.append('5');
            } else {
                sb.append('2');
            }
        }
        
        return sb.toString();
    }
}