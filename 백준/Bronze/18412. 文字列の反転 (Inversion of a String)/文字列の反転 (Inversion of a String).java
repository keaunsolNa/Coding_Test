import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < B-1; i++) {
			sb.append(S.charAt(i));
		}
		int cnt = 1;
		for(int i = B; i <= N; i++) {
			sb.append(S.charAt(N-cnt));
			cnt++;
		}
		
		for(int i = N; i < A; i++) {
			sb.append(S.charAt(i));
		}
		
		System.out.println(sb);
	}
}
