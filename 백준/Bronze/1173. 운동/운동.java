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
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer  st = new StringTokenizer(br.readLine());
	
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			long get = measure(temp);
			
			if(temp == get) sb.append("Perfect");
			else if(temp < get) sb.append("Abundant");
			else sb.append("Deficient");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static long measure(int N) {
		
		long ans = 0;
		
		for(int i = 1; i < N; i++) {
			if(N % i == 0) ans += i;
			
			if(ans > N) return ans;
		}
		
		return ans;
	}
}
