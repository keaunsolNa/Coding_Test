import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
public class Main {

    private static int N, M, W;
	private static List<int[]>[] list;
	private static int[] dist;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int TC = Integer.parseInt(br.readLine());
		
		while(TC --> 0) {
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());

			list = new ArrayList[N + 1];
			dist = new int[N + 1];
			for(int i = 1; i < N + 1; i++) list[i] = new ArrayList<>();
			
			for(int i = 0; i < M + W; i++) {
				
				st = new StringTokenizer(br.readLine());
				int S = Integer.parseInt(st.nextToken());
				int E = Integer.parseInt(st.nextToken());
				int T = Integer.parseInt(st.nextToken());
				
				if(i > M - 1) list[S].add(new int[] {E, -T});
				else {
					list[S].add(new int[] {E, T});
					list[E].add(new int[] {S, T});
				}
			}
			
			boolean flag = false;
			for(int i = 1; i <= N; i++) {
				if(bellmanford(i)) {
					flag = true;
					break;
				}
			}
			
			if(flag) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		System.out.println(sb);
	}

	private static boolean bellmanford(int s) {
		
		Arrays.fill(dist, 987654321);
		dist[s] = 0;
		
		boolean flag = false;
		for(int i = 0; i < N; i++) {
			
			flag = false;
			for(int j = 1; j < N + 1; j++) {
				
				int cur = j;
				for(int[] route : list[j]) {
					int next = route[0];
					int cost = route[1];
					
					if(dist[cur] == 987654321) continue;
					
					if(dist[next] > dist[cur] + cost) {
						
						dist[next] = dist[cur] + cost;
						flag = true;
						if(i == N - 1) return true;
					}
				}
			}
			
			if(!flag) break;
		}
		return false;
	}
}