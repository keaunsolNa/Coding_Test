class Solution {
    public int[] solution(long n) {
        
		 char[] charArr = (n + "").toCharArray();
		 int[] answer = new int[charArr.length];
		 
		 for(int i  = 0; i < charArr.length; i++) 
             answer[i] = charArr[charArr.length - (i + 1)] - '0';

		 return answer;
    }
}