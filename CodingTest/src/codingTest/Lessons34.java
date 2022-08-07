package codingTest;

public class Lessons34 {

	public static void main(String[] args) {
		
		Lessons34 lessons34 = new Lessons34();
		int[] answer = lessons34.solution(1183742);
		
		for (int i : answer) {
			System.out.println(i);
		}
	}
	
	 public int[] solution(long n) {
		 
//		 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//		 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		 
		 String str = n + "";
		 char[] charArr = str.toCharArray();
		 char temp = ' ';
		 int middle = charArr.length/2;
		 int[] answer = new int[charArr.length];
		 
		 for(int i  = 0; i < middle; i++) {
			 
			 temp = charArr[charArr.length - (i+1)];
			 charArr[charArr.length - (i+1)] = charArr[i];
			 charArr[i] = temp;
			 
		 }
		 
		 for(int i = 0; i<charArr.length; i++) {
			 int a = Character.getNumericValue(charArr[i]);  
			 answer[i] = a;
		 }
		 return answer;
		 
	    }
}
