import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		double min = Integer.MAX_VALUE;
		int winner = 0;
		
		for(int i = 1; i <= n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			double v = Integer.parseInt(st.nextToken());
			
			double rest = f - x;
			
			double time = rest / v ;
			
			if(time < min) {
				min = time;
				winner = i;
			}
		}
		
		System.out.println(winner);
		
	}
}
