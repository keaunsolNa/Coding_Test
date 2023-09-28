import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
	   
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
       
        String answer = A.add(B).toString();
        return answer;
    }
}