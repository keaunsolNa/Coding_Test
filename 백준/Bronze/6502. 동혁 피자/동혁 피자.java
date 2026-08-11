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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int idx = 1;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			double r = Integer.parseInt(st.nextToken());
			if(r == 0) break;
			
			double w = Integer.parseInt(st.nextToken());
			double l = Integer.parseInt(st.nextToken());

			double circle = Math.PI * r * r;
			double square = w * l;
			
			sb.append("Pizza " + idx);
			
			if(w * w + l * l <= 4 * r * r) sb.append(" fits on the table.");
			else sb.append(" does not fit on the table.");
			
			sb.append("\n");
			idx++;
		}
		
		System.out.print(sb);
	}
}
