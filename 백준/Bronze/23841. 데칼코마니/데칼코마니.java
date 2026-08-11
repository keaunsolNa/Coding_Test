import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			String reverse = new StringBuilder(input).reverse().toString();

			for(int k = 0; k < M; k++) {
				if(input.charAt(k) != '.') sb.append(input.charAt(k));
				else if (reverse.charAt(k) != '.') sb.append(reverse.charAt(k));
				else sb.append(".");
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
		
		
    }
}
