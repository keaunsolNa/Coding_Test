package codingTestLevel0;

import java.util.Arrays;

public class Lessons62 {
	
	public static void main(String[] args) {
		solution(".... . .-.. .-.. ---");
	}
	// 모스부호(1)
    public static String solution(String letter) {
        
        String[] morse = letter.split(" ");
        String[] morseDic = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        for (String string : morse) {
        	switch(Arrays.asList(morseDic).indexOf(string)) {
        		case 0 : sb.append("a"); break;
        		case 1 : sb.append("b"); break;
        		case 2 : sb.append("c"); break;
        		case 3 : sb.append("d"); break;
        		case 4 : sb.append("e"); break;
        		case 5 : sb.append("f"); break;
        		case 6 : sb.append("g"); break;
        		case 7 : sb.append("h"); break;
        		case 8 : sb.append("i"); break;
        		case 9 : sb.append("j"); break;
        		case 10 : sb.append("k"); break;
        		case 11 : sb.append("l"); break;
        		case 12 : sb.append("m"); break;
        		case 13 : sb.append("n"); break;
        		case 14 : sb.append("o"); break;
        		case 15 : sb.append("p"); break;
        		case 16 : sb.append("q"); break;
        		case 17 : sb.append("r"); break;
        		case 18 : sb.append("s"); break;
        		case 19 : sb.append("t"); break;
        		case 20 : sb.append("u"); break;
        		case 21 : sb.append("v"); break;
        		case 22 : sb.append("w"); break;
        		case 23 : sb.append("x"); break;
        		case 24 : sb.append("y"); break;
        		case 25 : sb.append("z"); break;
        	}
		}
        
        return sb.toString();
    }
    
}