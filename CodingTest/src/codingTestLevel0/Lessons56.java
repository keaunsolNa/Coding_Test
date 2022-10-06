package codingTestLevel0;

public class Lessons56 {
	
	// 외계행성의 나이
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageToString = age +"";
        for(int i = 0; i < ageToString.length(); i++){
            switch(ageToString.charAt(i)){
                case '0' :  sb.append("a"); break;
                case '1' :  sb.append("b"); break;
                case '2' :  sb.append("c"); break;
                case '3' :  sb.append("d"); break;
                case '4' :  sb.append("e"); break;
                case '5' :  sb.append("f"); break;
                case '6' :  sb.append("g"); break;
                case '7' :  sb.append("h"); break;
                case '8' :  sb.append("i"); break;
                case '9' :  sb.append("j"); break;
            }
        }
        return sb.toString();
    }
    
    
}