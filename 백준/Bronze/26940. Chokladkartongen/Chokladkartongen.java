import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int prev = Integer.parseInt(st.nextToken());
		T--;
		
		int ans = 0;
		while(T --> 0) {
			
			int now = Integer.parseInt(st.nextToken());
			
			if(prev < now) ans++;
			
			prev = now;
		}
		
		System.out.println(ans);
	}
}
