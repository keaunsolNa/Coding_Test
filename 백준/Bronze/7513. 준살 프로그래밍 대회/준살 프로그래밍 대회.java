import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			sb.append("Scenario #").append(i+1).append(":").append("\n");
			int m = Integer.parseInt(br.readLine());
			String[] word = new String[m];
			for(int j = 0; j < m; j++) word[j] = br.readLine();
			
			int n = Integer.parseInt(br.readLine());
			
			for(int z = 0; z < n; z++) {
				
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				
				for(int q = 0; q < k; q++) {
					int idx = Integer.parseInt(st.nextToken());
					sb.append(word[idx]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
