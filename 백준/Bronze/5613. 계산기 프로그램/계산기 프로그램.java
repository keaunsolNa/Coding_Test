import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		
		String operator = "";
		int sum = Integer.parseInt(br.readLine());
		int num;
		while(!(input = br.readLine()).equals("=")) {
			try {
				
				num = Integer.parseInt(input);
				
				switch(operator){
				
					case "+" : sum += num; break;
					case "-" : sum -= num; break;
					case "*" : sum *= num; break;
					case "/" : sum /= num; break;
					
				}
				
			} catch(java.lang.NumberFormatException e) {

				operator = input;
				
			}
		}
		System.out.println(sum);
		
	}
}
