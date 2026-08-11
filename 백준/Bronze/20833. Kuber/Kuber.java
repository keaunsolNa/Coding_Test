import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long A = Long.parseLong(br.readLine());
		
		long answer = 0;
		for(int i = 1; i <= A; i++) {
			answer += Math.pow(i, 3);
		}
		
		System.out.println(answer);
	}
}
