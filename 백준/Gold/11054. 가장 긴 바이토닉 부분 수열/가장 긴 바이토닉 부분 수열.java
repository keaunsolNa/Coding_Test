import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	private static int max;
	private static int n;
	private static Integer[] number;
	private static Integer[] dp4;
	private static Integer[] dp5;

	public static void main(String[] args) throws IOException {
		test13();
	}

	public static void test13() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		number = new Integer[N];
		dp4 = new Integer[N];
		dp5 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) number[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			lts(i);
			lds(i);
		}
		
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) ans = Math.max(ans, dp4[i] + dp5[i]);

		System.out.println(ans - 1);
	}

	private static int lts(int n) {
		
		if(dp4[n] == null) {
			dp4[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) {
				if(number[i] < number[n]) dp4[n] = Math.max(dp4[n], lts(i) + 1);
			}
		}
		
		return dp4[n];
	}

	private static int lds(int n) {
		
		if(dp5[n] == null) {
			dp5[n] = 1;
			
			for(int i = n + 1; i < dp5.length; i++) {
				if(number[i] < number[n]) dp5[n] = Math.max(dp5[n], lds(i) + 1);
			}
		}
		
		return dp5[n];
	}
}
