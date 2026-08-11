import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int totalMax = 0;
		String[] winner = new String[] {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"}; 
		String ans = "";
		
		for(int i = 0; i < 9; i++) {
			
			st = new StringTokenizer(br.readLine());
			int max = 0;
			for(int j = 0; j < N; j++) {
				max = Math.max(Integer.parseInt(st.nextToken()), max);
			}
			
			if(totalMax < max) {
				totalMax = max;
				ans = winner[i];
			}
		}
		
		System.out.print(ans);
		
	}
}
