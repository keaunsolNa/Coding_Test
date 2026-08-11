import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static boolean[] visit;
	private static int N;
	static int[][] pointMap;
	static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		N = Integer.parseInt(br.readLine());
 
		pointMap = new int[N][N];
		visit = new boolean[N];
 
 
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < N; j++) {
				pointMap[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		makeTeam(0, 0);
		System.out.println(Min);
	}

	static void makeTeam(int idx, int depth) {
		// 팀 조합이 완성될 경우
		if(depth == N / 2) {
			/*
			 방문한 팀과 방문하지 않은 팀을 각각 나누어
			 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			*/
			diff();
			return;
		}
 
		for(int i = idx; i < N; i++) {
			// 방문하지 않았다면?
			if(!visit[i]) {
				visit[i] = true;	// 방문으로 변경
				makeTeam(i + 1, depth + 1);	// 재귀 호출
				visit[i] = false;	// 재귀가 끝나면 비방문으로 변경
			}
		}
	}

	static void diff() {
		int ts = 0;
		int tl = 0;
 
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스 
				if (visit[i] == true && visit[j] == true) {
					ts += pointMap[i][j];
					ts += pointMap[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스 
				else if (visit[i] == false && visit[j] == false) {
					tl += pointMap[i][j];
					tl += pointMap[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int val = Math.abs(ts - tl);
		
		/*
		  두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
		  더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
		 */
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min = Math.min(val, Min);
				
	}
}
