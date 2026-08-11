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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		int A = 0;
		int B = 0;
		int C = 0;
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			A += Integer.parseInt(st.nextToken());
			B += Integer.parseInt(st.nextToken());
			C += Integer.parseInt(st.nextToken());
			
			if(A >= 30 && B >= 30 && C >= 30) {
				
				int min = Math.min(A, Math.min(B, C));
				
				sb.append(min + "\n");
				A -= min;
				B -= min;
				C -= min;
				
			} else sb.append("NO" + "\n");
				
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
