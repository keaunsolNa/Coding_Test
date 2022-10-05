package codingTestLevel0;

public class Lessons48 {
	
	// 369 게임
    public int solution(int order) {
        
        char[] temp = (order + "").toCharArray();
        int answer = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == '3'){
                answer++;
            } else if(temp[i] == '6') {
                answer++;
            } else if(temp[i] == '9'){
                answer++;
            }
        }
        
        return answer;
    }
}