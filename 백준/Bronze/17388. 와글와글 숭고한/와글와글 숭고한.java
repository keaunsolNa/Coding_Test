import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		if(S + K + H >= 100) {
			System.out.println("OK");
		} else {
			int temp = Math.min(Math.min(S, K), H);
			if(temp == S) {
				System.out.println("Soongsil");
			} else if(temp == K) {
				System.out.println("Korea");
			} else {
				System.out.println("Hanyang");
			}
		}
	}
}
