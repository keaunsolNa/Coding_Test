import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int RN = 0;
		if(R%N == 0) {
			RN = R/N;
		} else {
			RN = R/N + 1;
		}
		
		int CN = 0;
		if(C%N == 0) {
			CN = C/N;
		} else {
			CN = C/N + 1;
		}
		
		System.out.println((long)RN * CN);
	}
}
