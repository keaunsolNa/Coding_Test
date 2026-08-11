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
			int N = Integer.parseInt(br.readLine());
			
			
			st = new StringTokenizer(br.readLine());
			int sheep = 0;
			for(int j = 0; j < N; j++) {
				String target = st.nextToken();
				if(target.equals("sheep")) sheep++;
			}
			
			sb.append("Case " + (i + 1) + ": This list contains " + sheep + " sheep." + "\n" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
