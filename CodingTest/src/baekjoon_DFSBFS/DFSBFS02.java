package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}
	
	// 1388번 - 바닥 장식
	public static void test01() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++) {
        	
        	String temp = br.readLine();
        	for(int j = 0; j < M; j++) map[i][j] = (temp.charAt(j) == '-') ? 1 : 0;
        	
        }
    
        int x = 0;
        for(int i = 0; i < N; i++) {

        	int prevX = map[i][0];
        	x += prevX;
        	boolean chk = (prevX == 1) ? true : false;
        	for(int j = 1; j < M; j++) {
        		
        		if(map[i][j] != 1) {
        			chk = false;
        		} else {
        			if(!chk) x++;
        			chk = true;
        		}
        	}
        }
        
        int y = 0;
        for(int i = 0; i < M; i++) {
        	
        	int prevY = map[0][i];
        	y += (prevY == 0) ? 1 : 0;
        	boolean chk = (prevY == 0) ? true : false;
        	
        	for(int j = 1; j < N; j++) {
        		
        		if(map[j][i] != 0) {
        			chk = false;
        		} else {
        			if(!chk) y++;
        			chk = true;
        		}
        	}
        }
        
        System.out.println(x + y);
	}
	
	// 4963번 - 섬의 개수
	private static int arr[][];
	private static boolean visit[][];
	private static int dirX[] = {0, 0, -1 ,1, -1, 1, -1, 1}; 
	private static int dirY[] = {-1, 1, 0, 0, 1, 1, -1, -1};
	private static int w, h, nowX, nowY;
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")){
			
			st = new StringTokenizer(input);

			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken()); 
			arr = new int[h][w];
			visit = new boolean[h][w];

			for(int i = 0; i < h; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) arr[i][j] = Integer.parseInt(st.nextToken());
				
			}

			int cnt = 0;

			for(int i = 0; i < h; i++) {
				
				for(int j = 0; j < w; j++) {

					if(!visit[i][j] && arr[i][j] == 1) {
						cnt++;
						DFS(i, j);
					}
				}
			} 

			sb.append(cnt).append('\n');
		} 
		
		System.out.println(sb);
			
	}
		
	private static void DFS(int x, int y) {
		visit[x][y] = true;

		for(int i = 0; i < 8; i++) {
			nowX = dirX[i] + x;
			nowY = dirY[i] + y;
			if(range_check() && !visit[nowX][nowY] && arr[nowX][nowY] == 1) 
				DFS(nowX, nowY);
		}

	} 

	private static boolean range_check() {
		return (nowX >= 0 && nowY >= 0 && nowX < h && nowY < w);
	} 
	
	// 16173번 - 점프왕 쩰리 (Small)
	private static int N;
	private static int[] dx = {0, 1}, dy = {1, 0};
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		DFS2(0, 0);
		
		System.out.println("Hing");
	}
	
	public static void DFS2(int i, int j) {
		
		if(arr[i][j] == -1) {
			System.out.println("HaruHaru");
			System.exit(0);
		}
		
		for(int k = 0; k < 2; k++) {
			
			int x = i + dx[k] * arr[i][j];
			int y = j + dy[k] * arr[i][j];
			if(x >= N || y >= N || visit[x][y]) continue;
			
			visit[x][y] = true;
			DFS2(x, y);
		}
	}
	
	// 14940번 - 쉬운 최단거리
	private static int[] DX = { 1, 0, -1, 0 };
	private static int[] DY = { 0, -1, 0, 1 };
	private static int block = -2;
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Queue<int[]> q = new ArrayDeque<>();
		int[][] map = new int[n][m];
		
        for (int i = 0; i < n; i++) {
        	
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < m; j++) {
            	
                char cur = st.nextToken().charAt(0);
                map[i][j] = cur != '0' ? -1 : block;
                
                if (cur == '2') {
                    q.add(new int[]{i, j});
                    map[i][j] = 0;
                }
                
            }
        }

        while (!q.isEmpty()) {
        	
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
            	
                int nr = cur[0] + DX[i];
                int nc = cur[1] + DY[i];
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (map[nr][nc] == block || map[nr][nc] >= 0) continue;
                map[nr][nc] = map[cur[0]][cur[1]] + 1;
                q.add(new int[]{nr, nc});
                
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

        	for (int j = 0; j < m; j++) {
                if (map[i][j] == block) sb.append(0);
                else sb.append(map[i][j]);
                sb.append(' ');
            }
            
        	sb.append('\n');
        }

        System.out.print(sb);
        
	}
	
	
	// 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	//
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	// 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	//
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	



}
