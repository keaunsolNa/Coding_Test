import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] gnom = new int[n];
			for(int i = 0; i < n; i++) gnom[i] = Integer.parseInt(st.nextToken());
			
			int king = 0;
			
			for(int i = 1; i < n - 1; i++) 
				if(gnom[i - 1] + 1 != gnom[i]) {
					king = i + 1;
					break;
				}
			
			
			sb.append(king + "\n");
		}
		
		System.out.print(sb);
	}
}
