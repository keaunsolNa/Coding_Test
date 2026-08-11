import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			sb.append("Case " + i + ": ");
			
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
		
			int x = n / d;
			
			n -= d * x;
			
			if (n == 0) {
				System.out.println("Case " + i + ": " + x);
			} else if (x == 0) {
				System.out.println("Case " + i + ": " + n + "/" + d);
			} else {
				System.out.println("Case " + i + ": " + x + " " + n + "/" + d);
			}
		}
		
	}
}
