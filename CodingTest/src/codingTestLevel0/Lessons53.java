package codingTestLevel0;

public class Lessons53 {
	
	public static void main(String[] args) {
		solution("hello", 1, 2);
	}
	// 인덱스 바꾸기
    public static String solution(String my_string, int num1, int num2) {
        
    	StringBuilder sb = new StringBuilder();
    	char a = my_string.charAt(num1);
    	char b = my_string.charAt(num2);

    	for(int i = 0; i < my_string.length(); i++) {
    		if(i == num1) {
    			sb.append(b);
    		} else if(i == num2) {
    			sb.append(a);
    		} else {
    			sb.append(my_string.charAt(i));
    		}
    		
    	}
    	
        return sb.toString();
    }
    
}