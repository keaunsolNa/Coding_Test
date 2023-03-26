package baekjoon_GraphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GraphTheory01 {
	public static void main(String[] args) throws IOException {
		test08();
	}
	
	// 9372번 - 상근이의 여행
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < M; i++) br.readLine();
			
			sb.append((N - 1) + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 6416번 - 트리인가? 
	public static void test02() throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map;
		int tc = 1;
		
		while(true) {
			
			map = new HashMap<>();
			int edge = 0;
			
			while(true) {
				
				int A = sc.nextInt();
				int B = sc.nextInt();
				if(A == -1 && B == -1) return;
				else if(A == 0 && B == 0) break;

				map.put(A, map.getOrDefault(A, 0));
				map.put(B, map.getOrDefault(B, 0) + 1);
				edge++;
			}
			
			boolean chk = true;
			int root = 0;
			
			Iterator<Integer> key = map.keySet().iterator();
			
			while(key.hasNext()) {
				if(map.get(key.next()) == 0) root++;
				
				if(root > 1) {
					chk = false;
					break;
				}
			}
			
			if(map.size() == 0) 
				System.out.println("Case " + tc + " is a tree.");
			else if(chk && root == 1 && edge == map.size() - 1) 
				System.out.println("Case " + tc + " is a tree.");
			else
				System.out.println("Case " + tc + " is not a tree.");
			tc++;
		}
		
	}
	
	// 11558번 - The Game of Death
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int[] table = new int[N + 1];
			boolean[] chk = new boolean[N + 1];
			for(int i = 1; i <= N; i++) table[i]= Integer.parseInt(br.readLine());
			
			int idx = 1;
			int cnt = 0;
            boolean flag = false;
            while(!chk[idx]) {
            	
            	chk[idx] = true;
                if(idx == N) {
                    flag = true;
                    break;
                }
                
                idx = table[idx];
                cnt++;
            }
            
            System.out.println(flag ? cnt : 0);
		}
		
	}

	// 25418번 - 정수 a를 k로 만들기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		while(K != A) {
			
			if(K/2 == (double)K/2 && K/2 >= A) K/= 2;
			else K--;
			cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// 5567번 - 결혼식
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int res = 0;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		List<Integer> list[] = new ArrayList[n + 1];
		
		for(int i = 0; i < n; i++) list[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			list[a].add(b);
			list[b].add(a);
		}
		
		boolean[] visited = new boolean[n];
		visited[0] = true;
		
		Queue<Integer> que = new LinkedList<>();
		que.add(0);
		int cnt = 0;
		
		while(!que.isEmpty()) {
			
			int size = que.size();
			
			for (int i = 0; i < size; i++) {
			
				int x = que.poll();
				
				for (int nowx : list[x]) {
					
					if (visited[nowx]) continue;
					visited[nowx] = true;
					res++;
					que.add(nowx);
					
				}
			}
			
			cnt++;
			if(cnt==2) break;
			
		}
		
		System.out.println(res);
	}
	
	// 2206번 - 벽 부수고 이동하기
	private static int[] dx = {1, 0, -1, 0};
	private static int[] dy = {0, 1, 0, -1};
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        if(N-1 == 0 && M-1 == 0){
            System.out.print(1);
            System.exit(0);
        }

        char[][] miro = new char[N][M];  
        int[][] dist = new int[N][M];   
        boolean[][][] visit = new boolean[2][N][M];    
        Queue<int[]> qu = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = s.charAt(j);
            }
        }

        qu.offer(new int[]{0, 0, 0});   

        while (!qu.isEmpty()) {
            int[] cur = qu.poll();  
            
            for(int i = 0; i < 4; i++) {
                int nX = cur[0] + dx[i];
                int nY = cur[1] + dy[i];

                if (nX < 0 || nX >= N || nY < 0 || nY >= M) continue;
                
                
                if (miro[nX][nY] == '1') {
                    if(cur[2] == 0 && !visit[1][nX][nY]){ 
                        visit[cur[2]][nX][nY] = true;    
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1; 
                        qu.offer(new int[]{nX, nY, 1});   
                    }
                }
                
                else{
                	
                    if(!visit[cur[2]][nX][nY]) {
                    	
                        visit[cur[2]][nX][nY] = true;    
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1; 
                        qu.offer(new int[]{nX, nY, cur[2]});
                        
                    }
                }
                
                if(nX == N - 1 && nY == M - 1) {
                    System.out.print(dist[nX][nY] + 1);
                    System.exit(0);
                }
            }
        }
        
        System.out.print(-1);
	}
	
	// 16236번 - 아기 상어
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		
        int[] cur = null;

        // 맵 설정 및 초기 상어값 cur 변수 할당
        for (int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	
        	for (int j = 0; j < N; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		
        		if (map[i][j] == 9) {
        			cur = new int[]{i, j};
        			map[i][j] = 0;
        		}
        		
        	}	
        }
        
        // 최초 사이즈
        int nowSize = 2;
        
        // 먹은 물고기 숫자
        int eat = 0; 
        
        // 움직인 거리
        int move = 0; 
        
        while (true) {
        	
        	// 우선순위 큐. 
            PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) ->
                    o1[2] != o2[2] 
                    				? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] 
                    				? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
            
            		);
            
            // dfs visit 변수
            boolean[][] visit = new boolean[N][N];

            // 우선순위 큐에 x, y 좌표. 총 이동 거리 int 배열 초기값
            que.add(new int[]{cur[0], cur[1], 0});
            
            visit[cur[0]][cur[1]] = true;

            boolean ck = false; 

            while (!que.isEmpty()) {
            	
                cur = que.poll();

                // map에 먹이가 존재하고 상어의 사이즈보다 작은 경우
                if (map[cur[0]][cur[1]] != 0 && map[cur[0]][cur[1]] < nowSize) { 
                	
                	// 해당 위치 물고기 제거
                    map[cur[0]][cur[1]] = 0; 
                    eat++; 
                    move += cur[2]; 
                    ck = true; 
                    break;
                    
                }

                for (int k = 0; k < 4; k++) {
                	
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    if (ny < 0 || nx < 0 || nx >= N || ny >= N || visit[ny][nx] || map[ny][nx] > nowSize) continue;

                    que.add(new int[]{ny, nx, cur[2] + 1});
                    visit[ny][nx] = true;
                    
                }
            }

            // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
            if (!ck) break;

            // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
            if (nowSize == eat) { 
            	nowSize++;
                eat = 0;
            }
        }
        System.out.println(move);
	}
	
	// 1766번 - 문제집 (위상정렬)
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Integer>> map = new ArrayList<>();
		int [] preCnt = new int[N + 1];
		
		for(int i = 0; i <= N; ++i) map.add(new ArrayList<>());
		
		for(int i = 0; i < M; ++i) {
			
            st = new StringTokenizer(br.readLine());
            int prev = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            map.get(prev).add(next);
            preCnt[next]++;
            
        }
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	        
		for(int i = 1; i <= N; ++i) if(preCnt[i] == 0) pq.add(i);

		while(!pq.isEmpty()) {
			
            int cur = pq.poll();
            sb.append(cur).append(" ");

            for(int i : map.get(cur)) {
            	
                preCnt[i]--;
                if(preCnt[i] == 0) pq.add(i);
                
            }
        }

        System.out.print(sb.toString());
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
}
