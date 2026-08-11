import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		int idx = 1;
		
		while(!(input = br.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(input);
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			sb.append("Case ").append(idx).append(": ").append(L * (V/P) + Math.min(L, (V % P))).append("\n");
			idx++;
		}
		
		System.out.println(sb);
	}
}
