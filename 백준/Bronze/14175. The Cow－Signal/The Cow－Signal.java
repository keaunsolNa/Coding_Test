import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < m; i++) {
			
			String input = br.readLine();
			StringBuilder in = new StringBuilder();
			for(int j = 0; j < n; j++) {
			
				for(int q = 0; q < k; q++) in.append(input.charAt(j));
			}
			
			for(int q = 0; q < k; q++) sb.append(in).append("\n");
		}
		
		System.out.println(sb);
		
		
		
	}
	
	
}