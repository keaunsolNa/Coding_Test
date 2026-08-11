import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] voted = new int[N];
		for(int i = 0; i < N; i++) voted[i] = 0;
		
		int[] cost = new int[N];
		for(int i = 0; i < N; i++) cost[i] = Integer.parseInt(br.readLine());
		
		int[] standard = new int[M];
		for(int i = 0; i < M; i++) standard[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				if(standard[i] >= cost[j]) {
					voted[j]++;
					break;
				}
			}
		}
		
		int max = 0;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(voted[i] > max) {
				max = voted[i];
				ans = i;
			}
		}
		
		System.out.println(ans + 1);
	}
}
