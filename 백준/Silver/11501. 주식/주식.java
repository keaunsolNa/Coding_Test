import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			long[] money = new long[N + 1];
			for(int i = 0; i < N; i++) money[i] = Integer.parseInt(st.nextToken());
			
			long max = 0;
			long gain = 0;
			for(int i = N - 1; i >= 0; i--) {
				if(money[i] > max) max = money[i];
				else gain += (max - money[i]);
			}
			
			sb.append(gain +"\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
