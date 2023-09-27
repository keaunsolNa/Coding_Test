class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        int osl = overwrite_string.length();
        char[] my_string_arr = my_string.toCharArray();
		int temp = 0;
	   	
        for(int i = s; i < s + osl; i++) 
            my_string_arr[i] = overwrite_string.charAt(temp++);
 
        String answer = "";
        for (char c : my_string_arr) 
            answer += c;

        return answer;
    }
}