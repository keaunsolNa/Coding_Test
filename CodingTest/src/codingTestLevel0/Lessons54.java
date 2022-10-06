package codingTestLevel0;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lessons54 {
	
	// 중복된 문자 제거
    public String solution(String my_string) {
    	
    	Set<Character> set = new LinkedHashSet<>();

    	for(int i = 0; i < my_string.charAt(i); i++) {
    		set.add(my_string.charAt(i));
    	}

    	StringBuilder sb = new StringBuilder();
    	for (Character character : set) {
			sb.append(character);
		}
        return sb.toString();
    }
    
}