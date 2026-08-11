import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			
			long N = Long.parseLong(st.nextToken());
			long K = Long.parseLong(st.nextToken());
			long S = Long.parseLong(st.nextToken());
			
			long costTime = Math.min(N + K + 1, K + (Math.abs(K - S)) + (N - S));
			
			sb.append("Case #" + i +": " + costTime + "\n");
		}
		
		System.out.print(sb);
	}
}
