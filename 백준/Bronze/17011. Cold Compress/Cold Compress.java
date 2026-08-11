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
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			char[] input = br.readLine().toCharArray();
			
			int prev = input[0];
			int cnt = 1;
			for(int i = 1; i < input.length; i++) {
				
				if(prev == input[i]) cnt++;
				
				else  {
					sb.append(cnt + " " + (char)prev);
					cnt = 1;
					sb.append(" ");
				}
				
				prev = input[i];
				
			}
			
			sb.append(cnt + " " + (char)prev);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
