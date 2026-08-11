import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String time = br.readLine();
		
		int T = Integer.parseInt(br.readLine());
		
		int max = 0;
		String answer = "";
		while(T --> 0) {
			
			String input = br.readLine();
			
			int a = 0;
			int b = 0; 
			int c = 0;
			
			for(int i = 0; i < 4; i++) a += mul(time.charAt(i) - input.charAt(i));
			for(int i = 4; i < 6; i++) b += mul(time.charAt(i) - input.charAt(i));
			for(int i = 6; i < 8; i++) c += mul(time.charAt(i) - input.charAt(i));
			
			int sum = a * b * c;
			
			if(sum > max) {
				max = sum;
				answer = input;
			}
			
			else if(sum == max) 
				if(answer.compareTo(input) > 0) answer = input;
		
		}
	
		System.out.println(answer);
	}

	private static int mul(int num) {
		return (int) Math.pow(num, 2);
	}
}
