import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int idx = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			while(st.hasMoreTokens()) {
				
				int next = Integer.parseInt(st.nextToken());
				
				if(next > idx * 2) ans += next - idx * 2;
					
				idx = next;
			}
			
			System.out.println(ans);
		}
		
	}
}
