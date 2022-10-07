package codingTestLevel0;

public class Lessons77 {

	public static void main(String[] arg) {
		solution("onetwothreefourfivesixseveneightnine");
	}
	// 영어가 싫어요
    public static long solution(String numbers) {
    	
    	StringBuilder sb = new StringBuilder();
    	StringBuilder answer = new StringBuilder();
    	char[] arr = numbers.toCharArray();
    	for(int i = 0; i < arr.length; i++) {
    		sb.append(arr[i]);

    		switch(sb.toString()) {
    			case "zero" : answer.append(0); sb.setLength(0); break;
    			case "one" : answer.append(1); sb.setLength(0); break;
    			case "two" : answer.append(2); sb.setLength(0); break;
    			case "three" : answer.append(3); sb.setLength(0); break;
    			case "four" : answer.append(4); sb.setLength(0); break;
    			case "five" : answer.append(5); sb.setLength(0); break;
    			case "six" : answer.append(6); sb.setLength(0); break;
    			case "seven" : answer.append(7); sb.setLength(0); break;
    			case "eight" : answer.append(8); sb.setLength(0); break;
    			case "nine" : answer.append(9); sb.setLength(0); break;
    		}
    	}
    	
        long longAnswer = Long.parseLong(answer.toString());
        return longAnswer;
    }
    
}