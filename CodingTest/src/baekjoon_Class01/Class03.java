package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Class03 {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	// 1003번 - 피보나치 함수
	private static Integer[][] dp = new Integer[41][2];
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1;	
		dp[0][1] = 0;	
		dp[1][0] = 0;	
		dp[1][1] = 1;	
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T --> 0){
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
		System.out.println(sb);
	}
	
	private static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		
		return dp[N];
	}
    
    // 1012번 - 유기농 배추
	private static int dirX[] = {0, 0, -1, 1};
	private static int dirY[] = {-1, 1, 0, 0};
	private static int map[][];
	private static boolean visit[][];
	private static int now_x, now_y;
	private static int M, N, K;
	private static int count;
    public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			map = new int[N][M];
			visit = new boolean[N][M];

			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}

			count = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {

					if(map[j][k] == 1 && visit[j][k] == false) {
						count++;
						DFS(k, j);
					}
				}
			}
			sb.append(count).append('\n');
		}

		System.out.println(sb);
    }
    
	private static void DFS(int x, int y) {
		visit[y][x] = true;

		for(int i=0; i<4; i++) {
			now_x = x + dirX[i];
			now_y = y + dirY[i];

			if(Range_check() && visit[now_y][now_x] == false && map[now_y][now_x] == 1) {
				DFS(now_x, now_y);
			}

		}
	}

	private static boolean Range_check() {
		return (now_y < N && now_y >= 0 && now_x < M && now_x >= 0);
	}

    // 1074번 -  Z
	private static int cnt = 0;
    public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int size = (int)Math.pow(2, N);
				
		find(size, r, c);
		
		System.out.println(cnt);
    }
    
    private static void find(int size, int r, int c) {
		if(size == 1)
			return;
		
		if(r < size/2 && c < size/2) {
			find(size/2, r, c);
		}
		else if(r < size/2 && c >= size/2) {
			cnt += size * size / 4;
			find(size/2, r, c - size/2);
		}
		else if(r >= size/2 && c < size/2) {
			cnt += (size * size / 4) * 2;
			find(size/2, r - size/2, c);
		}
		else {
			cnt += (size * size / 4) * 3;
			find(size/2, r - size/2, c - size/2);
		}
    }

    // 1107번 리모콘
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		boolean[] broken = new boolean[10];
		StringTokenizer st;
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) broken[Integer.parseInt(st.nextToken())] = true;
		} 
		
		int result = Math.abs(N - 100);
		
		for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean chk = false;
            for(int j = 0; j < len; j++) {
            	
                if(broken[str.charAt(j) - '0']) { 
                	chk = true; 
                    break; 
                }
                
            }
            
            if(!chk) {
            	int min = Math.abs(N - i) + len; 
            	result = Math.min(min, result);
            }
            
		}
		
		System.out.println(result);
		 
    }
    
    // 영화감독 숌
    public static void test05() {
    }

    // 랜선 자르기
    public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    }
    

    // 스택 수열
    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }

    // 수 찾기
    public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }


    

}
