package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Test {

	// N개의 지점, M개의 도로, W개의 웜홀(N개의 노드, M개의 간선, W개의 음의 가중치를 갖는 간선)
	private static int N, M, W;
	// 그래프를 저장할 리스트
	private static List<int[]>[] list;
	// 간선 간의 거리를 저장할 배열
	private static int[] dist;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int TC = Integer.parseInt(br.readLine());

		while (TC-- > 0) {

			st = new StringTokenizer(br.readLine());

			// N개의 노드
			N = Integer.parseInt(st.nextToken());
			// M개의 간선
			M = Integer.parseInt(st.nextToken());
			// W개의 음의 가중치를 갖는 간선
			W = Integer.parseInt(st.nextToken());

			// 그래프 초기화
			list = new ArrayList[N + 1];
			// 거리 초기화
			dist = new int[N + 1];

			// 그래프에 빈 리스트 할당
			for (int i = 1; i < N + 1; i++)
				list[i] = new ArrayList<>();

			// 반복문은 음과 양의 간선 수를 합한 만큼 반복한다.
			for (int i = 0; i < M + W; i++) {

				st = new StringTokenizer(br.readLine());

				// 연결된 지점의 번호 S --> E
				int S = Integer.parseInt(st.nextToken());
				// 연결된 지점의 번호 S --> E
				int E = Integer.parseInt(st.nextToken());
				// 간선 간의 가중치
				int T = Integer.parseInt(st.nextToken());

				// 간선이 양의 간선일 경우 list에 E, -T를 할당한다.
				if (i > M - 1)
					list[S].add(new int[] { E, -T });

				// 갼선이 음의 간선일 경우
				else {

					// 노드에 간선간 가중치를 양으로 할당
					list[S].add(new int[] { E, T });
					list[E].add(new int[] { S, T });
				}
			}

			// 음수 순환 싸이클 여부를 판별하기 위한 flag
			boolean flag = false;

			// 노드의 수만큼 bellman-ford 알고리즘 수행
			for (int i = 1; i <= N; i++) {

				// 메서드의 수행 결과에 따른 flag 변수 처리. 이후 break
				if (bellmanford(i)) {
					flag = true;
					break;
				}
			}

			// 플래그에 따른 결과 값 입력
			if (flag)
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}

		System.out.println(sb);
	}

	// 벨만 - 포드 알고리즘
	private static boolean bellmanford(int s) {

		// 간선 간 가중치를 담을 배열에 최댓값을 넣어둔다.
		Arrays.fill(dist, Integer.MAX_VALUE);

		// 탐색의 시작점은 0으로
		dist[s] = 0;

		// 무한 반복 여부를 판별하기 위한 flag 변수
		boolean flag = false;

		// 노드의 숫자만큼 반복
		for (int i = 0; i < N; i++) {

			// flag의 초기값은 false
			flag = false;

			// 완전 탐색을 위한 내장 for문
			for (int j = 1; j < N + 1; j++) {

				// 현재 위치
				int cur = j;

				// 간선 간 가중치의 크기만큼 반복문 수행
				for (int[] route : list[j]) {

					// 다음 간선까지의 가중치와
					int next = route[0];
					// 그 비용
					int cost = route[1];

					// 아직 탐색하지 않았다면 반복
					if (dist[cur] == Integer.MAX_VALUE)
						continue;

					// 다음 간선이 현재 간선 + 비용보다 크다면 (음의 가중치)
					if (dist[next] > dist[cur] + cost) {

						// 다음 간선을 현재 간선 + 비용으로 초기화
						dist[next] = dist[cur] + cost;

						// flag 변수 = true
						flag = true;

						// 현재 탐색 지점이 마지막이라면 return true;
						if (i == N - 1)
							return true;
					}
				}
			}

			// flag 변수가 false라면 탐색 시 변화가 없었다는 의미이므로 메서드를 탈출한다.
			if (!flag)
				break;
		}

		// 기본 반환 값
		return false;
	}
}
