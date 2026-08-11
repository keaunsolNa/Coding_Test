import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int prev = Integer.parseInt(st.nextToken());
		
		int plus = 0;
		int minus = 0;
		for(int i = 1; i < T; i++) {
			
			int now = Integer.parseInt(st.nextToken());
			if(prev > now)  minus += (prev - now);
			else if(now > prev) plus += (now - prev);
			
			prev = now;
		}
		
		System.out.println(minus + " " + plus);
	}
}
