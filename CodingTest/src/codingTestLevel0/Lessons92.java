package codingTestLevel0;

public class Lessons92 {

	public static void main(String[] args) {
		String answer = solution("7 + 15");
		System.out.println(answer);
		
	}
	
	// 다항식 더하기
    public static String solution(String polynomial) {
    	
    	String[] poly = polynomial.split(" ");

    	int x = 0;
    	int number = 0;
    	for(int i = 0; i < poly.length; i++) {
    		
    		if(poly[i].contains("x")) {
    			
    			if(poly[i].length() == 1) {
    				x++;
    			} else {
    				x += Integer.parseInt(poly[i].replaceAll("x", ""));
    			}
    		} else if(!(poly[i].contains("+"))) {
    			number += Integer.parseInt(poly[i]);
    		}
    		
    	}
    	
    	if(number == 0 && x < 2) {
    		return "x";
    	} else if(number == 0 && x >= 2){
    		return x + "x";
    	} else if(number != 0 && x == 0) {
    		return number + "";
    	} else if(number != 0 && x < 2) {
    		return "x" + " + " + number;
    	} else {
    		return x + "x" + " + " + number;
    	}
    }
}