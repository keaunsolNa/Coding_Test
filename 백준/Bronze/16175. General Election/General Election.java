import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N];
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < N; j++) {
					arr[j] += Integer.parseInt(st.nextToken());
				}
			}
		
			int max = Integer.MIN_VALUE;
			int winner = 0;
			for(int ans = 0; ans < N; ans++) {
				if(arr[ans] > max) {
					max = arr[ans];
					winner = ans + 1;
				}
			}
			
			System.out.println(winner);
			
		}
		
	}
}
