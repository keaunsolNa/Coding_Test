import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int start = 1; start <= T; start++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append("Material Management " + start + "\n");
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				
				int size = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				
				
			}
			
			sb.append("Classification ---- End!" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
				
	}
}
