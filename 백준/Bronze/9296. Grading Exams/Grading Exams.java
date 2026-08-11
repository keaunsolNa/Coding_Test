import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++	) {
			
			int pro = Integer.parseInt(br.readLine());
			
			String input = br.readLine();
			String answer = br.readLine();
			
			int miss = 0;
			for(int j = 0; j < pro; j++) if(input.charAt(j) != answer.charAt(j)) miss++;
			
			
			sb.append("Case " + i + ": " + miss + "\n");
		}
		
		System.out.print(sb);
	}
}
