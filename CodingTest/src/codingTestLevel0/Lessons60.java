package codingTestLevel0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lessons60 {
	
	public static void main(String[] args) {
		solution("abcabcadc");
	}
	// 한 번만 등장한 문자
    public static String solution(String s) {
    	
    	Map<String, Integer> hashMap = new HashMap<>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		hashMap.put(s.charAt(i) + "", hashMap.getOrDefault(s.charAt(i) + "", 0) + 1);
    	}

    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < s.length(); i++) {
    		if(hashMap.get(s.charAt(i) + "") == 1){
    			sb.append(s.charAt(i));
    		}
    	}

    	char[] temp = sb.toString().toCharArray();
    	
    	Arrays.sort(temp);
    	
    	sb = new StringBuilder();
    	for(int i = 0; i < temp.length; i++) {
    		sb.append(temp[i]);
    	}
    	
        return sb.toString();
    }
    
}