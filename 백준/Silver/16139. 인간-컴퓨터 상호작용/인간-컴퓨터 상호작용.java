import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		int L = str.length();
		
		int[][] PS = new int[L + 1][26];
		PS[1][str.charAt(0) - 'a']++;
		
		for(int i = 2; i <= L; i++) {
			
			int idx = str.charAt(i - 1) - 'a';
			
			for(int j = 0; j < 26; j++) {
				
				int prefix = PS[i - 1][j];
				PS[i][j] = j == idx ? prefix + 1 : prefix;
			}
		
		}
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = st.nextToken().charAt(0) - 'a';
			int start = Integer.parseInt(st.nextToken()) + 1;
			int end = Integer.parseInt(st.nextToken()) + 1;
			
			sb.append(PS[end][idx] - PS[start - 1][idx] + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
		
	}
}
