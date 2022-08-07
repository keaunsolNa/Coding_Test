package codingTest;

public class Lessons28 {

	public static void main(String[] args) {

		Lessons28 lessons28 = new Lessons28();
		String s = "onetwothreefourfivesixseveneightnine";
		int answer = lessons28.solution(s);
		
		System.out.println("Result : " + answer);
	}

    public int solution(String s) {
    	
        String[] number = {"0" , "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i < 10; i++) {
        	s = s.replaceAll(alphabets[i], number[i]);
        }
        
        return Integer.parseInt(s);
    }
    
}
