import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			br.readLine();
			br.readLine();
			
			if(R <= W) sb.append("Yes");
			else sb.append("No");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
