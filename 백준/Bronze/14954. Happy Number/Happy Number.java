import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		
		boolean happy = false;
		while(true) {
			
			if(N == 1) {
				happy = true;
				break;
			} else if(N == 4 || N == 16 || N == 37 || N == 42 || N == 20) {
				break;
			}

			String temp = N + "";
			int t = 0;
			for(int i = 0; i < temp.length(); i++) 
				t += Math.pow(Character.getNumericValue(temp.charAt(i)), 2);
			
			N = t;
			
		}
		
		if(happy) System.out.println("HAPPY");
		else System.out.println("UNHAPPY");
		
	}
}
