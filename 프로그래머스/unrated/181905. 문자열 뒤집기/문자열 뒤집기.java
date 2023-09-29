class Solution {
    public String solution(String my_string, int s, int e) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(); 
        StringBuilder sb3 = new StringBuilder();        
        
        for(int i = 0; i < my_string.length(); i++) {
            
            if(i < s) sb1.append(my_string.charAt(i));
            else if(i >= s && i <= e) sb2.append(my_string.charAt(i));
            else sb3.append(my_string.charAt(i));
        }
        
        sb2 = sb2.reverse();
        
        return sb1.append(sb2).append(sb3).toString();
    }
}