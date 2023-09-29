import java.util.*; 
class Solution {
    public String solution(String my_string, int[] indices) {
        
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        
        System.out.println(sb);
        for(int i = 0; i < indices.length; i++ ) {
            sb = sb.replace(indices[i], indices[i] + 1, "A");
        }
        System.out.println(sb);
        String answer = sb.toString();
        return answer.replaceAll("A", "");
    }
}