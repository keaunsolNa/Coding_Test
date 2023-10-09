import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int answer = 0;
		for(int i = 0; i < N; i++) {
			
			int cnt = 0;
			for(int j = 0; j < K; j++) {
				
				int temp = Integer.parseInt(st.nextToken());
				cnt += temp == 0 ? 1 : 0;
			}
			
			if(cnt < P) answer++;
		}
		
		System.out.println(answer);
	}
}
