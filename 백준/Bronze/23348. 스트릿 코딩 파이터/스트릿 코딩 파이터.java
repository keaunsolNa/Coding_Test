import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		int winner = 0;
		for(int i = 0; i < T; i++) {
			
			int max = 0;
			for(int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				
				max += Integer.parseInt(st.nextToken()) * A;
				max += Integer.parseInt(st.nextToken()) * B;
				max += Integer.parseInt(st.nextToken()) * C;
			}
			
			if(max > winner) winner = max;
		}
		
		System.out.println(winner);
	}
}
