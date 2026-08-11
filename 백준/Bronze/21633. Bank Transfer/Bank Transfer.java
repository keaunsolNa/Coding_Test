import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double K = Double.parseDouble(br.readLine());
		
		double answer = K*0.01+25;
		
		if(answer < 100) {
			answer = 100.00;
		} else if(answer > 2000) {
			answer = 2000.00;
		}
		
		String A = answer+"";
		if(A.split("\\.")[1].length() == 1) {
			System.out.println(A+"0");
		} else {
			System.out.println(A);
		}
	}
}
