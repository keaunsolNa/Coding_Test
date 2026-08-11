import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] can = new int[N];
		for(int i = 0; i < N; i++) can[i] = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int prese = Integer.parseInt(st.nextToken());
			
			can[prese - 1] -= 1;
		}

		for (int i : can) {
			if(i < 0) sb.append("yes" +"\n");
			else sb.append("no" + "\n");
		}
		
		System.out.println(sb);
	}
}
