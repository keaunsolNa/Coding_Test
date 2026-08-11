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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append("Case #" + (i + 1) + ": ");
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[M][N];
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			long total = 0;
			for(int j = 0; j < N; j++) {
				int max = 0;
				
				for(int k = 0; k < M; k++) {
					if(k == P - 1) continue;
					
					max = Math.max(arr[k][j], max);
				}
				
				if(max > arr[P - 1][j]) total += max - arr[P - 1][j];
			}
			
			sb.append(total + "\n");
		}
		
		System.out.print(sb);
		
	}
}
