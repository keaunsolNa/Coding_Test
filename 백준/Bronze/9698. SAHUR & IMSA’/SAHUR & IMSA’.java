import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			sb.append("Case #" + i + ": ");
			
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(M - 45 < 0) {
				
				if(H - 1 < 0) sb.append(23 + " " + (M + 15));
				else sb.append((H - 1) + " " + (M + 15));
				
			} else sb.append(H + " " + (M - 45));
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}
}
