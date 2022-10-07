package codingTestLevel0;

public class Lessons80 {

	public static void main(String[] args) {
		String[] temp = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		solution(temp);
	}
	
	// OX퀴즈
    public static String[] solution(String[] quiz) {

    	String[] arr = new String[quiz.length];
    	for(int i = 0; i < quiz.length; i++) {
    		
    		String[] temp = quiz[i].split(" ");
    		int isAnswer = 0;
    		int answer = Integer.parseInt(temp[4]);
    		switch(temp[1]) {
    			case "+" : isAnswer = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]); break;
    			case "-" : isAnswer = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]); break;
    		}
    		
    		if(isAnswer == answer) {
    			arr[i] = "O";
    		} else {
    			arr[i] = "X";
    		}
    		
    	}
    	
        return arr;
    }
    
}