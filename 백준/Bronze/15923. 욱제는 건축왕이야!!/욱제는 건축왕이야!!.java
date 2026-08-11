import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int x0 = x;
		int y0 = y;
		long ans = 0;
		for(int i = 0; i < N - 1; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			double len = Math.sqrt(Math.pow(Math.abs(x2 - x) - Math.abs(y2 - y), 2));
			
			x = x2;
			y = y2;
		
			ans += len;
		}
		
		ans += Math.sqrt(Math.pow(Math.abs(x - x0) - Math.abs(y - y0), 2));
		
		System.out.println(ans);
	}
}
