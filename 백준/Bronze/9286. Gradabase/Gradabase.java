import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			sb.append("Case " + i + ":" + "\n");
			for(int j = 0; j < N; j++) {
				int grade = Integer.parseInt(br.readLine());
				
				if(grade != 6) sb.append(grade + 1).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);

	}
}
