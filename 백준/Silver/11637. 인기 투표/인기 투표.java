import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			int total = 0;
			int max = 0;
			int winner = 0;
			int cnt = 0;
			for(int j = 1; j <= N; j++) {
				
				int vote = Integer.parseInt(br.readLine());
				total += vote;
				
				if(max < vote) {
					max = vote;
					winner = j;
					cnt = 0;
				} else if(max == vote) cnt++;
			}
			
			if(max >= total / 2 + 1) sb.append("majority winner " + winner);
			else if(cnt == 0) sb.append("minority winner " + winner);
			else sb.append("no winner");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
