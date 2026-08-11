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

	public static void main(String[] args) throws IOException {
		test12();
	}

	public static void test12() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		number = new Integer[N];
		dp4 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) number[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) lts(i);
	
		int ans = Integer.MIN_VALUE;
		for (int i : dp4) if(ans < i) ans = i;
		
		System.out.println(ans);
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
}
